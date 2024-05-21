package com.group.projetowatch.Model;

public class PostagensMOdel{

    private String nomeUsuario;
    private String nomePostagem;
    private String texto;
    private String data;
    private Boolean spoiler;
    private String tipo;
  
  public PostagensMOdel(){}

  public PostagensModel(String nomeUsuario, String nomePostagem, String texto, String data, String tipo, Boolean spoiler){
    this.nomeUsuario = nomeUsuario;
    this.nomePostagem = nomePostagem;
    this.texto = texto;
    this.data = data;
    this.tipo = tipo;
    this.spoiler = spoiler;
  }
  public String getNomeUsuario(){
    return nomeUsuario;
  }
  public void setNomeUsuario(String nomeUsuario){
    this.nomeUsuario = nomeUsuario;
  }
  public String getnomePostagem(){
    return nomePostagem;
  }
  public void setNomePostagem(String nomePostagem){
    this.nomePostagem = nomePostagem;
  }
  public String getTexto(){
    return texto;
  }
  public void setTexto(String texto){
    this.texto = texto;
  }
  public String getData(){
    return data;
  }
  public void setData(String data){
    this.data = data;
  }
  public String getTipo(){
    return tipo;
  }
  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  public Boolean Spoiler(){
    return spoiler;
  }
  public void setSpoiler(Boolean spoiler){
    this.spoiler = spoiler;
  }

}