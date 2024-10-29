package springboot.mapping.SpringBoot_Company.Rpositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.mapping.SpringBoot_Company.Entities.DepartmentEntity;
import springboot.mapping.SpringBoot_Company.Entities.EmployeeEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
    DepartmentEntity findByManager(EmployeeEntity employeeEntity);
}
