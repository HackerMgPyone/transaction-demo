package com.example.transactiondemo.dao;

import com.example.transactiondemo.entity.EmployeeDto;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeData extends CrudRepository<EmployeeDto,Integer> {
}
