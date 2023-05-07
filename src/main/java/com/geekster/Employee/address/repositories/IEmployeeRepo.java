package com.geekster.Employee.address.repositories;

import com.geekster.Employee.address.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepo extends CrudRepository<Employee, Long> {
}
