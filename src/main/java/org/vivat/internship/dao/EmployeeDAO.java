package org.vivat.internship.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vivat.internship.configuration.DBConnection;
import org.vivat.internship.model.Employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO {

  private static final Logger log = LoggerFactory.getLogger(EmployeeDAO.class);

  public static final String SELECT_FROM_EMPLOYEE = "SELECT * FROM employee";


  public List<Employee> queryAll () {

    List<Employee> employees = new ArrayList<>();

    try (
        Connection connection = DBConnection.connect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SELECT_FROM_EMPLOYEE);
    ) {
      while (resultSet.next()) {

        Employee fetched = new Employee(
            resultSet.getLong("id"),
            resultSet.getString("first_name"),
            resultSet.getString("last_name")
        );

        employees.add(fetched);
      }
    } catch (SQLException e) {
      log.error(e.getMessage(), e);
    }
    return employees;
  }
}
