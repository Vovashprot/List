package service;

import think.example.demo.Employee;

public interface EmployeeService {
    public Employee add(String firstName, String lastname);
    public Employee remove(String firstName, String lastname);
    public Employee find(String firstName, String lastname);
}
