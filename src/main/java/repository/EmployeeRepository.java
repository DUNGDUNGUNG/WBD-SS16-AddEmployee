package repository;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements GeneralRepository<Employee>{
    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
    }
}
