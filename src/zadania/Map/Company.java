package zadania.Map;

import java.util.HashMap;

public class Company {

    private HashMap<String,Employee> employees;

    public Company() {
        this.employees = new HashMap<>();
    }

    private HashMap<String, Employee> getEmployees() {

        return employees;
    }

    public void setEmployees(HashMap<String, Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee( Employee employee){
        String key = employee.getName() + " " + employee.getSurname();
        this.employees.put(key,employee);
    }

    public String getEmployee(String empyoyeeFullName){
        if ((empyoyeeFullName != null) && this.getEmployees().containsKey(empyoyeeFullName)) {
            return this.employees.get(empyoyeeFullName).toString();
        }
        return "No such Employee";
    }

    
}
