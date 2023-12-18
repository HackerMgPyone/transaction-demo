package com.example.transactiondemo;

import com.example.transactiondemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class TransactionDemoApplication implements CommandLineRunner {

    private final EmployeeService employeeService;
    public static void main(String[] args) {
        SpringApplication.run(TransactionDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        employeeService.deleteAllEmployee();
        employeeService.doAction();
        employeeService.findAllEmployee()
                .forEach(System.out::println);

    }
}
