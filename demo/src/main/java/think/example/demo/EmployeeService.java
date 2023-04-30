
package think.example.demo;

import exceptions.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<>();
    public String addEmployee(String firstName, String lastName){
        Employee newEmployee = new Employee(firstName, lastName);
        employees.add(newEmployee);
        return "Employee added";
    }
    public String searchEmployee(String firstName, String lastName){
        Employee searchedEmployee = new Employee(firstName, lastName);
      for (int i = 0; i<employees.size();i++)  {
        if  (employees.get(i).equals(searchedEmployee)) {
            return employees.get(i).toString();
        }
      }
      throw new EmployeeNotFoundException();
    }
    public List<Employee> getEmployees() {
        return employees;
    }
}
