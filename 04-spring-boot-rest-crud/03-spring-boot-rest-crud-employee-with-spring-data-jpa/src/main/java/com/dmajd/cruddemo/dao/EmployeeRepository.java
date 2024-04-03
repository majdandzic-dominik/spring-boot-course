package com.dmajd.cruddemo.dao;

import com.dmajd.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
}
