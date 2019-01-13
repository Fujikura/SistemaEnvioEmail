package br.com.marcio.util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class EmailJava {

   public EmailJava() {    }



    public boolean enviarEmail(String destinatario, String assunto, String msg) {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("marciofujikura@gmail.com", "vinicius07"));
        email.setSSLOnConnect(true);
        email.setDebug(true);

        try {
            email.setFrom("marciofujikura@gmail.com");
            email.setSubject(assunto);
            email.setMsg(msg);
            email.addTo(destinatario);
            email.send();

            System.out.println("Email enviado com sucesso!");
            return true;

        }catch(Exception ex){

            System.out.println("Erro ao enviar email...");
            ex.printStackTrace();

            return false;
        }

    }
}
