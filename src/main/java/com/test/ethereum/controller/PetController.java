package com.test.ethereum.controller;

import com.test.ethereum.services.PetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

    @Autowired
    PetServices petServices;

    @RequestMapping(value = "/deploy", method = RequestMethod.POST)
    public void deploy() throws Exception {
        petServices.deploy();
    }
    @RequestMapping(value = "/load/{contractAddress}", method = RequestMethod.GET)
    public void load(@PathVariable("contractAddress") String contractAddress) throws Exception {
        petServices.load(contractAddress);
    }

    @RequestMapping(value = "/add/{contractAddress}/{name}/{type}", method = RequestMethod.PUT)
    public void addPet(@PathVariable("contractAddress") String contractAddress, @PathVariable("name") String name, @PathVariable("type") String type) throws Exception {
        petServices.addPet(contractAddress, name, type);
    }

    @RequestMapping(value = "/getAll/{contractAddress}", method = RequestMethod.GET)
    public void getAll(@PathVariable("contractAddress") String contractAddress) throws Exception {
        petServices.listAllPets(contractAddress);
    }

    @RequestMapping(value = "/totalCount/{contractAddress}", method = RequestMethod.GET)
    public void count(@PathVariable("contractAddress") String contractAddress) throws Exception {
        petServices.countPets(contractAddress);
    }

    @RequestMapping(value = "/details/{contractAddress}", method = RequestMethod.GET)
    public void detais(@PathVariable("contractAddress") String contractAddress) throws Exception {
        petServices.details(contractAddress);
    }
}
