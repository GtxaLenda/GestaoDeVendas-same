/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reisinformatica.gestao.venda.controller;

import com.reisinformatica.gestao.venda.modelo.conexao.Conexao;
import com.reisinformatica.gestao.venda.modelo.conexao.ConexaoMysql;
import com.reisinformatica.gestao.venda.modelo.dominio.Categoria;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Delta
 */
public class Main {
    public static void main(String[] args) throws SQLException{
        
        String sql = "Select * from categoria";
        
        Conexao conexao = new ConexaoMysql();
        
        Categoria Categoria = new Categoria(null, "Bebida Java", "Inserção no netbeans");
        
        PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(sql);
    }
    
}
