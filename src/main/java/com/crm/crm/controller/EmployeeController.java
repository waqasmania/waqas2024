package com.crm.crm.controller;

import com.crm.crm.entity.Employee;

import com.crm.crm.payload.EmployeeDto;
import com.crm.crm.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public ResponseEntity<?>addEmployee
            (@Valid @RequestBody EmployeeDto dto, BindingResult result) {
        if(result.hasErrors()){
            return new ResponseEntity<>(result.getFieldError().getDefaultMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
        EmployeeDto employeeDto=employeeService.addEmployee(dto);
        return new ResponseEntity<>(employeeDto, HttpStatus.CREATED);

    }

    @DeleteMapping
    public String deleteEmployee(@RequestParam Long id) {
        employeeService.deleteEmployee(id);
        return "deleted";
    }

    @GetMapping
    public List<Employee> getEmployee() {

        List<Employee> employees = employeeService.getEmployee();
        return employees;
    }
}
