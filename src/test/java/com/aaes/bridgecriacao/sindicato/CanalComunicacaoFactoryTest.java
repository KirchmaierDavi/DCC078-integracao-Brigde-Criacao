package com.aaes.bridgecriacao.sindicato;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CanalComunicacaoFactoryTest {

    @Test
    void deveCriarCanalDeEmail() {
        assertInstanceOf(EmailCanal.class, CanalComunicacaoFactory.criar(TipoCanal.EMAIL));
    }

    @Test
    void deveCriarCanalDeSms() {
        assertInstanceOf(SmsCanal.class, CanalComunicacaoFactory.criar(TipoCanal.SMS));
    }

    @Test
    void deveRecusarTipoNulo() {
        assertThrows(IllegalArgumentException.class, () -> CanalComunicacaoFactory.criar(null));
    }
}
