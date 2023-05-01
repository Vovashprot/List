
package think.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
    @GetMapping(path = "/employee/add")
    public String createEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName
    )
    {

        return "Добавлен сотрудник " + firstName +" "+ lastName;
    }

}
