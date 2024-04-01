package com.dmajd.cruddemo.service;

import com.dmajd.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
