package com.example.crmredstring.mapper;

import com.example.crmredstring.dto.ClientDTO;
import com.example.crmredstring.model.Client;

public class ClientMapper {

    public static Client dtoToClient(ClientDTO clientDTO) {
        Client client = new Client(clientDTO.getCompanyName(), clientDTO.getFirstName(), clientDTO.getLastName(), clientDTO.getEmail(), clientDTO.getPhone(), clientDTO.getAddress(), clientDTO.getZipCode(), clientDTO.getCity(), clientDTO.getCountry(), clientDTO.getState());
        return client;
    }
}
