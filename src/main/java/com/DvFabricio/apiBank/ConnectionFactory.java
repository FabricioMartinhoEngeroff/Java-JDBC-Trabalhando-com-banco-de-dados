package com.DvFabricio.apiBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection recuperarConexao() {
        try {
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/DvFabricio_bank?user=root&password=1234567");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

