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
        <title id="idTitle">Cadastro de cliente</title>
        <link rel="stylesheet" href="css.css"/>

    </head>
    <body id="idimagen">
        <a href="index.html" id="idindex">Home</a>
    <center>
        <h1 id="h1cliente">Cadastro de cliente</h1>
        <hr id="hrcliente">
        <form action="ClienteControle" method="POST">

            <input type="hidden" name="action" value="add"/>
            <table border="0" width="1">
                <tr>
                    <td><input type="text" id="txtCliente" name="nome" value="" required="" placeholder="Digite seu nome"/></td>
                </tr>
                <tr>
                    <td><input type="text" id="txtCliente" name="cpf" value="" required="" placeholder="Digite seu cpf"/></td>
                </tr>
                <tr>
                    <td><input type="text" id="txtCliente" name="telefone" value="" required="" placeholder="Digite seu telefone" /></td>
                </tr>
                <tr>
                    <td>
                        <input type="date" id="txtCliente" name="data"  value="" required=""/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" id="btncliente" value="Salvar" name="salvar"/>
                    </td>
                </tr>

            </table>
        </form>
    </center>
</body>
</html>
