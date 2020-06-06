package hms.sessions.dockersessionucsc.service;

import hms.sessions.dockersessionucsc.domain.Employee;
import hms.sessions.dockersessionucsc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        repository.findAll().forEach(employees::add);
        return employees;
    }

    @Override
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Optional<Employee> findById(long id) {
        return repository.findById(id);
    }
}
