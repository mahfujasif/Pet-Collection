package com.test.ethereum.services;

import com.test.ethereum.wrapper.PetCollection;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Transaction;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tuples.generated.Tuple2;

import java.math.BigInteger;

@Service
public class PetServices {

    Web3j web3j = Web3j.build(new HttpService("http://127.0.0.1:7545"));
    Credentials credentials = Credentials.create("a6485dd358c4b02769c8b2aed932588b8964e1d6609c1d308bbb96234284e813");


    /**
     *
     * @return
     * @throws Exception
     */
    public PetCollection deploy() throws Exception {
        PetCollection petCollection = PetCollection.deploy(
                web3j,
                credentials,
                new BigInteger("0"),
                new BigInteger("3000000"),
                "petCollection1",
                new BigInteger("5")
        ).send();
        pendingTransactions();
        System.out.println(petCollection.name().send() + " smart contract deployed.");
        System.out.println("address " + petCollection.getContractAddress());
        return petCollection;
    }


    /**
     *
     * @param contractAddress
     * @return
     * @throws Exception
     */
    public PetCollection load(String contractAddress) throws Exception {
        Web3j web3j = Web3j.build(new HttpService("http://127.0.0.1:7545"));
        Credentials credentials = Credentials.create("a6485dd358c4b02769c8b2aed932588b8964e1d6609c1d308bbb96234284e813");
        PetCollection petCollection = PetCollection.load(
                contractAddress,
                web3j,
                credentials,
                new BigInteger("3"),
                new BigInteger("50")
        );
        pendingTransactions();
        System.out.println("loaded contract" + petCollection.name().send());
        System.out.println("contract validity: " + petCollection.isValid());
        return petCollection;
    }


    /**
     *
     * @param contractAddress
     * @param name
     * @param type
     * @throws Exception
     */
    public void addPet(String contractAddress, String name, String type) throws Exception {
        PetCollection petCollection = load(contractAddress);
        System.out.println("adding pet "+ name + "of type " + type);


        // validation for approval

        TransactionReceipt transactionReceipt =
                petCollection.addPet(name, type).send();
        pendingTransactions();
        System.out.println(transactionReceipt.getStatus());
        System.out.println("added "+ name + " " + type);
        System.out.println(transactionReceipt.toString());
    }


    /**
     *
     * @param contractAddress
     * @throws Exception
     */
    public void listAllPets(String contractAddress) throws Exception {
        PetCollection petCollection = load(contractAddress);
        Integer size = petCollection.totalPets().send().intValue();
        for (Integer i = 0; i < size; i++) {
            Tuple2<String, String> pet = petCollection.petList(new BigInteger(i.toString())).send();
            System.out.println(i + " : name " + pet.getValue1() + " type " + pet.getValue2());
        }
    }


    /**
     *
     * @param contractAddress
     * @throws Exception
     */
    public void countPets(String contractAddress) throws Exception {
        PetCollection petCollection = load(contractAddress);
        System.out.println("total pets: " + petCollection.totalPets().send());
    }


    /**
     *
     * @param contractAddress
     * @throws Exception
     */
    public void details(String contractAddress) throws Exception {
        PetCollection petCollection = load(contractAddress);
        System.out.println("contract name: " + petCollection.name().send());
        System.out.println("max capability: " + petCollection.maxCapability().send());
    }


    /**
     *
     */
    public void pendingTransactions(){
        Transaction c;
        web3j.pendingTransactionObservable().subscribe(tx -> {
            System.out.println("block hash " + tx.getBlockHash());
            System.out.println("block number " + tx.getBlockNumber());
            System.out.println("creats " + tx.getCreates());
        });
    }
}
