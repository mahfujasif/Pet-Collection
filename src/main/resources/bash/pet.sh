solc /home/mahfuj/workspace/ethereum-dapp-demo/src/main/resources/solidity/PetCollection.sol --bin --abi --optimize -o /home/mahfuj/workspace/ethereum-dapp-demo/src/main/resources/bytecodes

web3j solidity generate /home/mahfuj/workspace/ethereum-dapp-demo/src/main/resources/bytecodes/PetCollection.bin /home/mahfuj/workspace/ethereum-dapp-demo/src/main/resources/bytecodes/PetCollection.abi -o /home/mahfuj/workspace/ethereum-dapp-demo/src/main/java -p com.test.ethereum.wrapper
