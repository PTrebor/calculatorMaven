package com.endava.apache;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.*;
import java.util.List;

import static com.endava.apache.Log4jExample.LOGGER;

public class DBConnection {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://bhdtest.endava.com:3306/petclinic","root","root");
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT id, first_name FROM owners WHERE ID = 5");
        while(resultSet.next()){
           Object id = resultSet.getObject("id");
            Object firstName = resultSet.getObject("first_name");

            LOGGER.info("{} {}", id, firstName);
        }

        LOGGER.info(resultSet);


    }
}
