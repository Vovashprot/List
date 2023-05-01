
package think.example.demo;

import exceptions.EmployeeAlreadyAddedException;
import exceptions.EmployeeNotFoundException;
import exceptions.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    int listLimit = 5;
    List<Employee> employees = new ArrayList<>();

    public String addEmployee(String firstName, String lastName){
        if(employees.size() >= listLimit){
            throw new EmployeeStorageIsFullException();
        }
        Employee newEmployee = new Employee(firstName, lastName);
        if (employees.contains(newEmployee)){
            throw new EmployeeAlreadyAddedException();
        }
        employees.add(newEmployee);
        return "Employee added";
    }
    public Employee searchEmployee(String firstName, String lastName){
        Employee searchedEmployee = new Employee(firstName, lastName);
      for (int i = 0; i<employees.size();i++)  {
        if  (employees.get(i).equals(searchedEmployee)) {
            return employees.get(i);
        }
      }
      throw new EmployeeNotFoundException();
    }
    public String deleteEmployee(String firstName, String lastName){
        employees.remove(searchEmployee(firstName,lastName));
        return "Employee deleted";
    }
    public List<Employee> getEmployees() {
        return employees;
    }
}
