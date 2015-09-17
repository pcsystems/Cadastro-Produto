<%-- 
    Document   : lista-cliente
    Created on : 15/09/2015, 15:03:00
    Author     : tiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de clientes</title>
    </head>
    <body>
    <center>
        <form action="ClienteControle" method="POST">
            <input type="hidden" name="action" value="listar" />
            <input type="search" name="pesquisa" value="" placeholder="Enter ou digita o valor da pesquisa"/>
            <table aling="center" border="1px" width="80%">

                <tr>
                    <th>Codigo</th>
                    <th>Nome</th>
                    <th>Cpf</th>
                    <th>Telefone</th>
                    <th>Data</th>
                    <th>Editar</th>
                    <th>Remover</th>
                </tr>
                <c:forEach var="c" items="${lista}">                
                    <tr>
                        <td>${c.codigo}</td>
                        <td>${c.nome}</td>
                        <td>${c.cpf}</td>
                        <td>${c.telefone}</td>
                        <td>${c.data}</td>
                        <td> <a href="ClienteControle?action=busca&id=${c.codigo}">Editar</a></td>
                        <td> <a href="ClienteControle?action=remover&id=${c.codigo}">Editar</a></td>
                    </tr>

                </c:forEach>
            </table>
        </form>
    </center>
</body>
</html>
