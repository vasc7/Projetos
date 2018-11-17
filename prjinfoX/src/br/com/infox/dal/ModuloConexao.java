/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author vasco
 */
public class ModuloConexao {

    //método responsável pela conexão com o Banco de Dados
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //verificação do driver de conexão
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informações referente ao banco - caminho, usuário, senha
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //Estabelecer conexão com o Banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }

    }

}
