package com.crm.crm.service;

import com.crm.crm.Repository.EmployeeRepository;
import com.crm.crm.entity.Employee;

import com.crm.crm.payload.EmployeeDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

 private EmployeeRepository employeeRepository;;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDto addEmployee(@Valid EmployeeDto employee) {
         save s= employeeRepository.save(employee);
        return employee;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }


    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }
}

