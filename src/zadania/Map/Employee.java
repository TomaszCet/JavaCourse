package zadania.Map;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private double salary;

    @Override
    public String toString() {
        return name + ' ' + surname + ", salary:" + salary;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.getSalary(), getSalary()) == 0 &&
                Objects.equals(getName(), employee.getName()) &&
                Objects.equals(getSurname(), employee.getSurname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getSalary());
    }
}
