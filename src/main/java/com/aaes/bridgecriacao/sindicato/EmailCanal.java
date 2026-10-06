package com.aaes.bridgecriacao.sindicato;

public final class EmailCanal implements CanalComunicacao {

    @Override
    public String enviar(String destinatario, String mensagem) {
        return "E-mail enviado para " + destinatario + ": " + mensagem;
    }
}
