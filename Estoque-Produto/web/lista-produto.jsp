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
        <title>Lista de produtos</title>
        <link rel="stylesheet" href="produtocss.css"/>

    </head>
    <body>

    <center>

        <form action="ProdutoControle" method="POST">

            <input type="hidden" name="action" value="listar" />
            <a href="cadastro-produto.jsp" id="incluir-produto">Incluir Produto</a>
            <input type="search" id="pesquisa" name="pesquisa" value="" placeholder="Enter ou digita o valor da pesquisa"/>
            <table id="tabela-lista" aling="center" border="1px">

                <tr>
                    <th id="th">Codigo</th>
                    <th id="th">Descrição</th>
                    <th id="th">Quantidade</th>
                    <th id="th">Preço</th>
                    <th id="th">Valor da compra</th>
                    <th id="th">Data</th>
                </tr>
                <c:forEach var="p" items="${lista}">                
                    <tr>
                        <td>${p.codigo}</td>
                        <td><a href="ProdutoControle?action=buscar&descricao=${p.descricao}">${p.descricao}</a></td>
                        <td>${p.qtd}</td>
                        <td>${p.preco}</td>
                        <td>${p.valor}</td>
                        <td>${p.data}</td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </center>
</body>
</html>
