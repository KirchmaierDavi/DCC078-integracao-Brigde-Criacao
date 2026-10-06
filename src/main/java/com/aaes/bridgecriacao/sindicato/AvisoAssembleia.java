package com.aaes.bridgecriacao.sindicato;

public final class AvisoAssembleia extends AvisoSindicato {

    private final String data;
    private final String local;

    public AvisoAssembleia(CanalComunicacao canal, String data, String local) {
        super(canal);
        this.data = data;
        this.local = local;
    }

    @Override
    public String montarMensagem() {
        return "Assembleia do sindicato em " + data + ", no local " + local + ".";
    }
}
