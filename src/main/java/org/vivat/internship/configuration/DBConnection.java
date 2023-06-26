package org.vivat.internship.configuration;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

  private static final Logger log = LoggerFactory.getLogger(DBConnection.class);
  private static final String url = "jdbc:postgresql://0.0.0.0:5432/employee";
  private static final String user = "postgres";
  private static final String password = "";


  public static Connection connect() {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(url, user, password);

      if (connection != null) {
        log.info("Connected to the PostgreSQL server successfully.");
      } else {
        log.error("Failed to connect!");
      }

    } catch (SQLException e) {
      log.error(e.getMessage());
    }

    return connection;
  }

}
