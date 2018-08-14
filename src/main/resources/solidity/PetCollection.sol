pragma solidity ^0.4.2;

contract PetCollection {
    string public name;
    uint public maxCapability;
    Pet[] public petList;

    struct Pet {
        string name;
        string species;
    }

    constructor(string _name, uint _maxCapability) public {
        name = _name;
        maxCapability = _maxCapability;
    }

    function addPet(string petName, string petSpecies) public {
        uint length = petList.length;
        if(length < maxCapability) {
            petList.push(Pet(petName, petSpecies));
        }
    }

    function totalPets() constant public returns(uint n) {
        return petList.length;
    }
}
