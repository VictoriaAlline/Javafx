package com.group.projetowatch.Model;
import javafx.collections.ObservableList;

public class FiltrosModel{

    private ObservableList<String> filtros;
    private String nomeUsuario;
  
  public FiltrosModel(){
  }

  public FiltrosModel(String nomeUsuario, ObservableList<String> filtros){
    this.nomeUsuario = nomeUsuario;
    this.filros = filtros;
  }
  public ObservableList<String> getFiltros(){
    return filtros;
  }
  public ObservableList<String> setFiltros(ObservableList<String> filtros){
    this.filtros = filtros;    
  }
  
}