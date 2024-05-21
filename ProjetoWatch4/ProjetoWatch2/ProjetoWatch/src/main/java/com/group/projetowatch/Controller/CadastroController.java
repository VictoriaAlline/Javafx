package com.group.projetowatch.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastroController {

    @FXML
    private PasswordField campoConfirmarsenha;
    @FXML
    private TextField EmailText;
    @FXML
    private TextField NascimentoText;
    @FXML
    private TextField campoNomeusuario;
    @FXML
    private PasswordField SenhaText;

    @FXML
    protected void botaoEntrar() {

        UsuarioModel model = new UsuarioModel();
        UsuarioController usuarioController = new UsuarioController();

        String cidade = "nulo";
        String filtro = "nulo";

        model.setNome(campoNomeusuario.getText());
        model.setCidade(cidade);
        model.setEmail(EmailText.getText());
        model.setFiltro(filtro);
        model.setSenha(SenhaText.getText());
        model.setDataNascimento(NascimentoText.getText());

        if(usuarioController.cadastrarUsuario(model)){
            TelaController telaController = new TelaController();
            telaController.TrocarTela(event, "TelaInicial.fxml");
        } else {
            campoNomeusuario.clear();
            EmailText.clear();
            NascimentoText.clear();
            SenhaText.clear();
            //preciso de alguma forma para avisar o usuário do que está acontecendo e o que fazer a seguir
        }
    }

    //precisa ser adicionado o botão de login na tela de cadastro porque ainda não tem um

    //para selecionar a foto do usuário precisa de "botão" para ele clicar  aparecer o FileChooser e eu conseguir colocar o código para pegar e salvar a foto

}
