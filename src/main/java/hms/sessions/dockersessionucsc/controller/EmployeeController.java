package hms.sessions.dockersessionucsc.controller;

import hms.sessions.dockersessionucsc.domain.Employee;
import hms.sessions.dockersessionucsc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    private final EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public Employee save(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Optional<Employee> findById(@PathVariable long id) {
        return service.findById(id);
    }
}
