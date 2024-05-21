package com.group.projetowatch.Controller;

import java.util.ArrayList;

public class UsuarioController {

    public static ArrayList<UsuarioModel> dadosUsuario;

    public UsuarioController() {

        this.dadosUsuario = new ArrayList<>();
    }

    public UsuarioModel autenticarUsuario(UsuarioModel model) {
        for (UsuarioModel usuarioModel : dadosUsuario) {
            if (usuarioModel.getNome().equals(model.getNome()) && usuarioModel.getSenha().equals(model.getSenha())) {
                return usuarioModel;
            }
        }
        return null;
    }

    public boolean verificarSenhas(UsuarioModel model, String confirmarSenha){
            if(model.getSenha().equals(confirmarSenha)){
                return true;
            }
        return false;
    }

    public boolean verificarNomes(UsuarioModel model) {
        for (UsuarioModel usuarioModel : dadosUsuario) {
            if (usuarioModel.getNome().equals(model.getNome()) && usuarioModel.getEmail().equals(model.getEmail())) {
                return false;
            }
        }
        return true;
    }

    public boolean cadastrarUsuario(UsuarioModel model) {
        if (!verificarNomes(model)) {
            System.out.println("Esse nome ou email já cadastrados.");
            return false;
        }
        dadosUsuario.add(model);
        return true;
    }

}
