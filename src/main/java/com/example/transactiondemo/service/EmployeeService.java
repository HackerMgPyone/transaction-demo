package com.example.transactiondemo.service;

import com.example.transactiondemo.dao.EmployeeDao;
import com.example.transactiondemo.dao.EmployeeData;
import com.example.transactiondemo.dao.EmployeeJdbcClient;
import com.example.transactiondemo.dao.EmployeeRepository;
import com.example.transactiondemo.entity.Employee;
import com.example.transactiondemo.entity.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeDao employeeDao;
    private final EmployeeJdbcClient employeeJdbcClient;
    private final EmployeeRepository employeeRepository;

    private final EmployeeData employeeData;

    public void createEmployee(EmployeeDto employeeDto){
        employeeData.save(employeeDto);
    }

    public void doAction(){
        employeeDao.createEmployee("Mg","Mg",
                "mgmg@gmail.com","000-000-000",20000);

        employeeJdbcClient.createEmployee(
                new Employee("Ko","Ko","koko@gmail.com","555-555-555",50000)
        );

        employeeRepository.save(new Employee("Su","Su","susu@gmail.com","666-666-666",30000));
    }

    public void deleteAllEmployee(){
        employeeJdbcClient.deleteAllEmployee();
    }

    public List<Employee> findAllEmployee(){
        return employeeJdbcClient.findAllEmployee();
    }
}


