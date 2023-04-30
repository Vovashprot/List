package think.example.demo;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String getfirstName() {
        return firstName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                ", firstName='" + firstName + '\'' +
                ", lastName =" + lastName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
