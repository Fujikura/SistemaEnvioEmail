package br.com.marcio.controler;

import br.com.marcio.util.EmailJava;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EnvioEmailServlet", urlPatterns = {"/Email/Enviar"})
public class EnvioEmailServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //obtem o parametro vindo do input digitado no form
        String destinatario = request.getParameter("dest");
        String assunto = request.getParameter("assunto");
        String mensagem = request.getParameter("mensagem");

        String msg = null;
        boolean enviou = false;


       //chama o metodo de envio de email
        EmailJava emailJava = new EmailJava();
        enviou = emailJava.enviarEmail(destinatario, assunto, mensagem);

        if (enviou)
            msg = "E-mail enviado com sucesso!!";
        else
            msg = "Não foi possivel enviar o e-mail, contrate o administrador do sistema...";

        //retorna uma mensagem de resposta para o usuário
        request.setAttribute("msg", msg);
        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
        rd.forward(request, response);


    }


}
