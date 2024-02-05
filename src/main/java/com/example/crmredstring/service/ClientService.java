package com.example.crmredstring.service;

import com.example.crmredstring.dto.ClientDTO;
import com.example.crmredstring.mapper.ClientMapper;
import com.example.crmredstring.model.Client;
import com.example.crmredstring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    public List<Client> getAll() {
        return repository.findAll();
    }

    public void add(ClientDTO clientDTO) {
        Client client = ClientMapper.dtoToClient(clientDTO);
        repository.save(client);
    }

    public Client getById(int id) {
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("Client's id: "+id+" not found")
        );
    }

    public void put(int id, ClientDTO clientDTO) {
        Client client = getById(id);
        client.setCompanyName(clientDTO.getCompanyName());
        client.setFirstName(clientDTO.getFirstName());
        client.setLastName(clientDTO.getLastName());
        client.setEmail(clientDTO.getEmail());
        client.setPhone(clientDTO.getPhone());
        client.setAddress(clientDTO.getAddress());
        client.setZipCode(clientDTO.getZipCode());
        client.setCity(clientDTO.getCity());
        client.setCountry(clientDTO.getCountry());
        client.setState(clientDTO.getState());
        repository.save(client);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
