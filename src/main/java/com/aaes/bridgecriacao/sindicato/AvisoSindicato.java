package com.aaes.bridgecriacao.sindicato;

/**
 * Abstração do Bridge: define o que o sindicato comunica,
 * sem conhecer os detalhes do canal.
 */
public abstract class AvisoSindicato {

    private final CanalComunicacao canal;

    protected AvisoSindicato(CanalComunicacao canal) {
        if (canal == null) {
            throw new IllegalArgumentException("O canal de comunicação é obrigatório");
        }
        this.canal = canal;
    }

    public abstract String montarMensagem();

    public String enviarPara(String contato) {
        if (contato == null || contato.isBlank()) {
            throw new IllegalArgumentException("O contato é obrigatório");
        }
        return canal.enviar(contato, montarMensagem());
    }
}
