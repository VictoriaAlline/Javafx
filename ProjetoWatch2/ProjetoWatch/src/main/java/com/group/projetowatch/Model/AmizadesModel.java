package com.group.projetowatch.Model;

public class AmizadeModel {

    private String nomeUsuario;
    private String nomeAmigo;
    private String foto;

    public AmizadeModel() {
    }

    public AmizadeModel(String nomeAmigo, String nomeUsuario, String foto) {
        this.nomeUsuario = nomeUsuario;
        this.nomeAmigo = nomeAmigo;
        this.foto = foto;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}