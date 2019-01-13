
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>


<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="<c:url value='/css/bootstrap.css'/>"/>

    <title>Envio de email</title>
</head>
<body>

    <div class="container">
        <h1>Envio de email com Apache Common</h1>
        <form action="/Email/Enviar" method="post">
            <div class="for-group">
                <label for="dest">Destinátario</label>
                <input class="form-control" type="text" name="dest" id="dest"
                            placeholder="E-mail do destinátrio"/>
            </div>

            <div class="for-group">
                <label for="assunto">Assunto</label>
                <input class="form-control" type="text" name="assunto" id="assunto"
                       placeholder="Assunto do E-mail"/>
            </div>

            <div class="for-group">
                <label for="mensagem">Mensagem</label>
                <textarea class="form-control" type="" name="mensagem" id="mensagem"
                          placeholder="Mensagem do E-mail">
                </textarea>
            </div>

            <input class="btn btn-primary btn-block" type="submit" value="Enviar Email"/>

        </form>

        <div class="alert-info">${msg}</div>


    </div>
</body>
</html>
