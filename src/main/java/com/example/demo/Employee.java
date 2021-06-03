package com.example.demo;

public class Employee {
    private int empNo;
    private String empName;
    private int sal;

    public Employee() {

    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", sal=" + sal +
                '}';
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public int getSal() {
        return sal;
    }

    public Employee(int empNo, String empName, int sal) {
        this.empNo = empNo;
        this.empName = empName;
        this.sal = sal;
    }


}
