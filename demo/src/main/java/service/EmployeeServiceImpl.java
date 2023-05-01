package service;

import exceptions.EmployeeAlreadyAddedException;
import exceptions.EmployeeNotFoundException;
import exceptions.EmployeeStorageIsFullException;
import service.EmployeeService;
import think.example.demo.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    int listLimit = 5;
    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastname) {
        if (employeeList.size()<listLimit){
            throw new EmployeeStorageIsFullException();
        }
        Employee employee = new Employee(firstName, lastname);
        if (employeeList.contains(employee)){
            throw new EmployeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;
    }
    @Override
    public Employee remove(String firstName, String lastname) {
        Employee employee = new Employee(firstName, lastname);
        if (employeeList.contains(employeeList)){
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String firstName, String lastname) {
        Employee employee = new Employee(firstName, lastname);
        if (employeeList.contains(employee)){
            return employee;
        }
        throw new EmployeeNotFoundException();
    }
}
