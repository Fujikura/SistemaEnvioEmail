package br.com.marcio.teste;

import br.com.marcio.util.EmailJava;

public class TesteEnvioEmail {

    public static void main(String[] args) {

        EmailJava emailJava = new EmailJava();
        emailJava.enviarEmail("marciofujikura@hotmail.com", "E-mail de teste", "Foi enviado um novo e-mail de teste");
    }
}
