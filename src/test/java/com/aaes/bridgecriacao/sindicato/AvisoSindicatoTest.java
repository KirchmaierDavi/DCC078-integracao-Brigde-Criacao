package com.aaes.bridgecriacao.sindicato;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AvisoSindicatoTest {

    @Test
    void deveEnviarAvisoDeAssembleiaPorEmail() {
        AvisoSindicato aviso = new AvisoAssembleia(
                CanalComunicacaoFactory.criar(TipoCanal.EMAIL),
                "10/11/2026",
                "Sede do sindicato"
        );

        assertEquals(
                "E-mail enviado para filiado@email.com: Assembleia do sindicato em 10/11/2026, no local Sede do sindicato.",
                aviso.enviarPara("filiado@email.com")
        );
    }

    @Test
    void devePermitirTrocarOCanalSemAlterarOAviso() {
        AvisoSindicato aviso = new AvisoNegociacaoSalarial(
                CanalComunicacaoFactory.criar(TipoCanal.SMS),
                "6%"
        );

        assertEquals(
                "SMS enviado para 11999999999: Negociação salarial atualizada: reajuste de 6%.",
                aviso.enviarPara("11999999999")
        );
    }

    @Test
    void deveRecusarContatoVazio() {
        AvisoSindicato aviso = new AvisoAssembleia(
                CanalComunicacaoFactory.criar(TipoCanal.EMAIL),
                "10/11/2026",
                "Sede do sindicato"
        );

        assertThrows(IllegalArgumentException.class, () -> aviso.enviarPara(" "));
    }
}
