package com.example.agendagora;

import java.io.IOException;

public class ConfiguracoesController {

    public void voltar() throws IOException {
        AgendaApplication.setRoot("menu-principal-view");

    }
    public void abrirusuarios() throws IOException {
        AgendaApplication.setRoot("usuarios-view");
    }
    public void abririnformacoes() throws IOException {
        AgendaApplication.setRoot("informacoes-view");
    }

}
