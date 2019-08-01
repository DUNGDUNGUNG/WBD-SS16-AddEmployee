package service;

import model.Employee;
import repository.EmployeeRepository;

public class EmployeeService implements GeneralService<Employee> {
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}
