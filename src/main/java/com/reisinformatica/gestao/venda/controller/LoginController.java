/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reisinformatica.gestao.venda.controller;

import com.reisinformatica.gestao.venda.view.formulario.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Delta
 */
public class LoginController implements ActionListener {
    
    private final Login login;
    
    public LoginController(Login login){
        this.login = login;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String accao = ae.getActionCommand().toLowerCase();
        switch (accao){
            case "login":login(); break;
            case "cancelar" :cancelar(); break;
        }
    }

    private void login() {
        String usuario = this.login.getTxtLoginUsuario().getText();
        String senha = this.login.getTxtLoginSenha().getText();
        
        if(usuario.equals("") || senha.equals("")) {
            this.login.getLabelLoginMensagem().setText("Usuario e senha devem ser preenchido");
            return;
        }
        
        
        
        
    }

    private void cancelar() {
        
    }
    
    
}
