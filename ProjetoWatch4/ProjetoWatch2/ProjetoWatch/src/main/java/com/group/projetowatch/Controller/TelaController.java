package com.group.projetowatch.Controller;

public class TelaController{

	public TelaController(){

	}

	@FXML
	public void TrocarTela(ActionEvent event, String nomeTela) throws IOException{

		root = FXMLLoader.load(getClass().getResource(nomeTela));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();

		stage.setMinHeight(500);
		stage.setMinWidth(1100);
		stage.setMaxWidth(1400);

		cena = new Scene(root);
		stage.setScene(cena);
		stage.show();
	}

}