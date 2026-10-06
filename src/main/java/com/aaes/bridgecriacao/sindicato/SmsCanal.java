package com.aaes.bridgecriacao.sindicato;

public final class SmsCanal implements CanalComunicacao {

    @Override
    public String enviar(String destinatario, String mensagem) {
        return "SMS enviado para " + destinatario + ": " + mensagem;
    }
}
