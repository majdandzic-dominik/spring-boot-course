package com.dmajd.cruddemo.dao;

import com.dmajd.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> findAll();
}
