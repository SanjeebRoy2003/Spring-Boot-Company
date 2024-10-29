package springboot.mapping.SpringBoot_Company.Rpositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mapping.SpringBoot_Company.Entities.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
