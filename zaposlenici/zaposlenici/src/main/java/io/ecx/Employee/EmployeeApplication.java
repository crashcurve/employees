package io.ecx.Employee;

import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Transactional
public class EmployeeApplication
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        SpringApplication.run(EmployeeApplication.class, args);
    }

}
