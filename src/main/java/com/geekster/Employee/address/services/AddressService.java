package com.geekster.Employee.address.services;

import com.geekster.Employee.address.models.Address;
import com.geekster.Employee.address.repositories.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private IAddressRepo addressRepository;

    public List<Address> getAllAddress() {
        return (List<Address>) addressRepository.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return  addressRepository.findById(id);

    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }


    public void updateAddress(Long id,Address address) {
        Optional<Address> existingAddress = addressRepository.findById(id);
        if (existingAddress.isPresent()) {
            address.setId(id);
            Address savedAddress = addressRepository.save(address);
        }
    }

    public void  deleteAddressById(Long id) {
        Optional<Address> address = addressRepository.findById(id);
        if (address.isPresent()) {
            addressRepository.deleteById(id);
        }
    }
}
