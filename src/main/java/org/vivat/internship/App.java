package org.vivat.internship;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vivat.internship.dao.EmployeeDAO;


public class App {

  private static final Logger log = LoggerFactory.getLogger(App.class);


  public static void main (String[] args) {

    EmployeeDAO employeeDAO = new EmployeeDAO();

    employeeDAO.queryAll()
        .forEach(employee -> log.info(employee.toString()));
  }
}
