package hms.sessions.dockersessionucsc.repository;

import hms.sessions.dockersessionucsc.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
