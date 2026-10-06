package com.aaes.bridgecriacao.sindicato;

/**
 * Padrão de criação: centraliza a criação dos implementadores do Bridge.
 */
public final class CanalComunicacaoFactory {

    private CanalComunicacaoFactory() {
    }

    public static CanalComunicacao criar(TipoCanal tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("O tipo do canal é obrigatório");
        }

        return switch (tipo) {
            case EMAIL -> new EmailCanal();
            case SMS -> new SmsCanal();
        };
    }
}
