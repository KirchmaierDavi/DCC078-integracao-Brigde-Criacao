package com.aaes.bridgecriacao.sindicato;

public final class AvisoNegociacaoSalarial extends AvisoSindicato {

    private final String reajuste;

    public AvisoNegociacaoSalarial(CanalComunicacao canal, String reajuste) {
        super(canal);
        this.reajuste = reajuste;
    }

    @Override
    public String montarMensagem() {
        return "Negociação salarial atualizada: reajuste de " + reajuste + ".";
    }
}
