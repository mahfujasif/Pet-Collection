# Pet-Collection
This project is a demo implementation of ethereum blockchain using web3j java library. Smart contract is written in solidity. We used spring-boot framework and apache-maven build-automation tool.

Set up local environment by following bellow steps.
#1. Download and execute [ganache](https://truffleframework.com/ganache) and a private test network will be created with test accounts.
#2. Click on symbolic 'key' button on any account in ganache network and copy the private key.
#3. Open /src/main/java/com/test/ethereum/services/PetServices.java
#4. Instantiate credentials in line 18 with the copied private key. (private key will be shifted to properties file soon, sorry folks).
#5. Update maven dependancies.
#6. Run TESTEthereumApplication.
#7. Make a POST request to the ulr https://localhost:8081/deploy to deploy the smart contract.
