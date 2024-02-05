package com.example.crmredstring.controller;

import com.example.crmredstring.dto.ClientDTO;
import com.example.crmredstring.model.Client;
import com.example.crmredstring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService service;

    @GetMapping
    public List<Client> getAll() {
        return service.getAll();
    }

    @PostMapping
    public void add(@RequestBody ClientDTO clientDTO) {
        service.add(clientDTO);
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public void put(@PathVariable int id, @RequestBody ClientDTO clientDTO) {
        service.put(id, clientDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }
}
