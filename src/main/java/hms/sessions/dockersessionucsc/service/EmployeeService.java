package hms.sessions.dockersessionucsc.service;

import hms.sessions.dockersessionucsc.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    Employee save(Employee employee);

    Optional<Employee> findById(long id);
}
