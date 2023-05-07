package com.geekster.Employee.address.repositories;

import com.geekster.Employee.address.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address, Long> {
}
