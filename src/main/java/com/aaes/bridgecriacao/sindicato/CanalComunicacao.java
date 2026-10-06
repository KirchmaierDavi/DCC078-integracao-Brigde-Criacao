package com.aaes.bridgecriacao.sindicato;

/**
 * Implementador do Bridge: define como um aviso chega ao filiado.
 */
public interface CanalComunicacao {

    String enviar(String destinatario, String mensagem);
}
