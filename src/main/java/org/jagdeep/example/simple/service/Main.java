/**
 * @author jagdeepjain
 *
 */
package org.jagdeep.example.simple.service;

import static spark.Spark.get;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class Main {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://localhost:3306/sonar";  
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
        ((JdbcConnectionSource)connectionSource).setUsername("root");
        ((JdbcConnectionSource)connectionSource).setPassword("jjain");
        
        Dao<Graphs,String> graphsDao = DaoManager.createDao(connectionSource, Graphs.class);

        get("/users/:id", (req, res) -> {
            Graphs graphs = graphsDao.queryForId(req.params(":id"));
            if (graphs != null) {
                return ("Resource ID : " + graphs.getResourceId()); // or JSON? :-)
            } else {
                res.status(404); // 404 Not found
                return "User not found";
            }
        }); 
    }
}