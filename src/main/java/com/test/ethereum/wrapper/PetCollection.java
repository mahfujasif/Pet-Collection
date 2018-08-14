package com.test.ethereum.wrapper;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.5.0.
 */
public class PetCollection extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516106f93803806106f983398101604052805160208083015191909201805190926100439160009185019061004d565b50600155506100e8565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061008e57805160ff19168380011785556100bb565b828001600101855582156100bb579182015b828111156100bb5782518255916020019190600101906100a0565b506100c79291506100cb565b5090565b6100e591905b808211156100c757600081556001016100d1565b90565b610602806100f76000396000f30060806040526004361061006c5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166306fdde0381146100715780633e092227146100fb5780634a9699ef14610122578063932ce2f214610218578063987eae8f146102b1575b600080fd5b34801561007d57600080fd5b506100866102c6565b6040805160208082528351818301528351919283929083019185019080838360005b838110156100c05781810151838201526020016100a8565b50505050905090810190601f1680156100ed5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561010757600080fd5b50610110610354565b60408051918252519081900360200190f35b34801561012e57600080fd5b5061013a60043561035a565b604051808060200180602001838103835285818151815260200191508051906020019080838360005b8381101561017b578181015183820152602001610163565b50505050905090810190601f1680156101a85780820380516001836020036101000a031916815260200191505b50838103825284518152845160209182019186019080838360005b838110156101db5781810151838201526020016101c3565b50505050905090810190601f1680156102085780820380516001836020036101000a031916815260200191505b5094505050505060405180910390f35b34801561022457600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526102af94369492936024939284019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497506104a69650505050505050565b005b3480156102bd57600080fd5b50610110610537565b6000805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152929183018282801561034c5780601f106103215761010080835404028352916020019161034c565b820191906000526020600020905b81548152906001019060200180831161032f57829003601f168201915b505050505081565b60015481565b600280548290811061036857fe5b60009182526020918290206002918202018054604080516001831615610100026000190190921693909304601f8101859004850282018501909352828152909350918391908301828280156103fe5780601f106103d3576101008083540402835291602001916103fe565b820191906000526020600020905b8154815290600101906020018083116103e157829003601f168201915b505050505090806001018054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561049c5780601f106104715761010080835404028352916020019161049c565b820191906000526020600020905b81548152906001019060200180831161047f57829003601f168201915b5050505050905082565b600254600154811015610532576040805180820190915283815260208082018490526002805460018101808355600083905284518051919594929093027f405787fa12a823e0f2b7631cc41b3ba8828b3321ca811111fa75cd3aa3bb5ace019261051492849291019061053e565b50602082810151805161052d926001850192019061053e565b505050505b505050565b6002545b90565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061057f57805160ff19168380011785556105ac565b828001600101855582156105ac579182015b828111156105ac578251825591602001919060010190610591565b506105b89291506105bc565b5090565b61053b91905b808211156105b857600081556001016105c25600a165627a7a7230582017dc9b10bbc5ef44a2a42f95dedc6e3a543f7940689937019812561d96646f5d0029";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_MAXCAPABILITY = "maxCapability";

    public static final String FUNC_PETLIST = "petList";

    public static final String FUNC_ADDPET = "addPet";

    public static final String FUNC_TOTALPETS = "totalPets";

    protected PetCollection(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected PetCollection(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> maxCapability() {
        final Function function = new Function(FUNC_MAXCAPABILITY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Tuple2<String, String>> petList(BigInteger param0) {
        final Function function = new Function(FUNC_PETLIST, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple2<String, String>>(
                new Callable<Tuple2<String, String>>() {
                    @Override
                    public Tuple2<String, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<String, String>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> addPet(String petName, String petSpecies) {
        final Function function = new Function(
                FUNC_ADDPET, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(petName), 
                new org.web3j.abi.datatypes.Utf8String(petSpecies)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> totalPets() {
        final Function function = new Function(FUNC_TOTALPETS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<PetCollection> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _name, BigInteger _maxCapability) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.generated.Uint256(_maxCapability)));
        return deployRemoteCall(PetCollection.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<PetCollection> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _name, BigInteger _maxCapability) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.generated.Uint256(_maxCapability)));
        return deployRemoteCall(PetCollection.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static PetCollection load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new PetCollection(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static PetCollection load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new PetCollection(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
