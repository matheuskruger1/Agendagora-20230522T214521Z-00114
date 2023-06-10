package com.example.agendagora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    public boolean existe(Usuario usuario) throws SQLException {
        Connection connection = DriverManager.getConnection( //
                "jdbc:mysql://localhost:3306/agendagora", //
                "root", //
                "");

        String sql = "select count(*) from usuario "//
                + "where login = '" + usuario.usuario + "' "//
                + "and senha = '" +usuario.senha + "'";
        ResultSet resultado = connection.createStatement().executeQuery(sql);
        resultado.next();
        int quantidadedeusuarios = resultado.getInt(1);
        if (quantidadedeusuarios ==1){
            return true;
        }else{
            return false;
        }
    }
}
