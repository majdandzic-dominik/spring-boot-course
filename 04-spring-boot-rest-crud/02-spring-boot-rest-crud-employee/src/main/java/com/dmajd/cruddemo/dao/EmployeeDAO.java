package com.dmajd.cruddemo.dao;

import com.dmajd.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
