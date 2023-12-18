package com.example.transactiondemo;

import com.example.transactiondemo.entity.EmployeeDto;
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
//        employeeService.createEmployee(
//                new EmployeeDto(
//                        1,
//                        "zaw",
//                        "zaw",
//                        "zaw@gmail.com",
//                        "000-000-000",
//                        50000
//                )
//        );
//        employeeService.createEmployee(
//                new EmployeeDto(
//                        2,
//                        "lin",
//                        "lin",
//                        "lin@gmail.com",
//                        "001-000-000",
//                        70000
//                )
//        );
        employeeService.doAction();
        employeeService.findAllEmployee()
                .forEach(System.out::println);

    }
}
