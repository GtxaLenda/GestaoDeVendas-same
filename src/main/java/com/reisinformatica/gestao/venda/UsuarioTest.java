/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reisinformatica.gestao.venda;

import com.reisinformatica.gestao.venda.modelo.dominio.Perfil;
import com.reisinformatica.gestao.venda.modelo.dao.UsuarioDao;
import com.reisinformatica.gestao.venda.modelo.dominio.Usuario;
import java.time.LocalDateTime;


/**
 *
 * @author Delta
 */
public class UsuarioTest {
    
    public static void main(String[] args){
       Usuario usuario = new Usuario (0L, "Gabriel Reis","2204", "Reis", Perfil.ADMIN,null, null);
       
       UsuarioDao usuarioDao = new UsuarioDao();
       String mensagem = usuarioDao.salvar(usuario);
        System.out.println(mensagem);
    }
    
}
