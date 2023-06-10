package com.example.agendagora;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    public List<Cliente> getAll() throws SQLException {
        Connection connection = DriverManager.getConnection( //
                "jdbc:mysql://localhost:3306/agendagora", //
                "root", //
                "");
        ResultSet rs = connection.createStatement().executeQuery("select * from cliente ORDER BY nomecliente asc");
        List<Cliente> clientes = new ArrayList<>();
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.codigo = rs.getInt(1);
            cliente.nome = rs.getString(2);
            cliente.endereco = rs.getString(3);
            cliente.telefone = rs.getString(4);
            clientes.add(cliente);
        }
        return clientes;
    }

    public void creat(Cliente novocliente) throws SQLException {
        Connection connection = DriverManager.getConnection( //
                "jdbc:mysql://localhost:3306/agendagora", //
                "root", //
                "");

        PreparedStatement preparedStatement = connection.prepareStatement("insert into cliente(clienteid,nomecliente,enderecocliente,fonecliente) values (?,?,?,?)");
        preparedStatement.setInt(1, novocliente.codigo);
        preparedStatement.setString(2, novocliente.nome);
        preparedStatement.setString(3, novocliente.endereco);
        preparedStatement.setString(4, novocliente.telefone);

        preparedStatement.execute();
    }

    public void deleat(Cliente clienteexcluido) throws SQLException {
        Connection connection = DriverManager.getConnection( //
                "jdbc:mysql://localhost:3306/agendagora", //
                "root", //
                "");
        PreparedStatement preparedStatement = connection.prepareStatement("delete from cliente where clienteid = ?");
        preparedStatement.setInt(1, clienteexcluido.codigo);

        preparedStatement.execute();

    }

    public void upadate(Cliente clienteselecionado) throws SQLException {
        Connection connection = DriverManager.getConnection( //
                "jdbc:mysql://localhost:3306/agendagora", //
                "root", //
                "");
        PreparedStatement preparedStatement = connection.prepareStatement("update cliente set nomecliente = ?, enderecocliente =?,fonecliente= ? where clienteid = ?");
        preparedStatement.setString(1, clienteselecionado.nome);
        preparedStatement.setString(2, clienteselecionado.endereco);
        preparedStatement.setString(3, clienteselecionado.telefone);
        preparedStatement.setInt(4, clienteselecionado.codigo);

        preparedStatement.execute();

    }

    public boolean clienteexiste(Cliente cliente) throws SQLException {
        Connection connection = DriverManager.getConnection( //
                "jdbc:mysql://localhost:3306/agendagora", //
                "root", //
                "");
        if (cliente !=null) {
            String sql = "select count(*)from cliente where fonecliente =" + '"' + cliente.telefone + '"';
            ResultSet resultadocliente = connection.createStatement().executeQuery(sql);
            resultadocliente.next();
            int clienteexiste = resultadocliente.getInt(1);

            if (clienteexiste > 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }



}





