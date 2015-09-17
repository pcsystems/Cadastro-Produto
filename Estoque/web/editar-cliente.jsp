<%-- 
    Document   : cadastro-cliente
    Created on : 15/09/2015, 13:30:24
    Author     : tiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns:h="http://java.sun.com/jsf/html" xmlns:f="http://java.sun.com/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="produtocss.css"/>

    </head>
    <body id="produtoBady">
    <center>
        <h1 id="produtoH1">Atualizacão de cliente</h1>
        <hr>
        <form action="ClienteControle?action=editar" method="POST">

            <table border="1" width="1">
                <tr>
                    <td>${c.codigo}<input type="hidden" name="codigo" value="${c.codigo}" required="" placeholder="Digite seu nome"/></td>
                </tr>
                <tr>
                    <td><input type="text" name="nome" id="produtoCampo" value="${c.nome}" required="" placeholder="Digite seu nome"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="cpf" id="produtoCampo" value="${c.cpf}" required="" placeholder="Digite seu cpf"/>

                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="telefone" id="produtoCampo" value="${c.telefone}" required="" placeholder="Digite seu telefone" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="date" name="data" id="produtoCampo" value="${c.data}" required=""/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <input type="submit"   id="produtoBotao" value="Salvar" name="salvar"/>

                    </td>

                </tr>

            </table>
        </form>
    </center>
</body>
</html>
