package com.example.demo.controller;

import com.example.demo.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee getEmp(){

        Employee emp = new Employee();
        System.out.println("Employee"+emp);
               emp.setEmpNo(11);
               emp.setEmpName("vasu");
               emp.setSal(3000);

        return emp;
    }
}
