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
        <link rel="stylesheet" href="css.css"/>
        <title>Lista de produtos</title>
    </head>
    <body id="idimagen">
        <a href="index.html" id="idindex">Home</a>
    <center>
        <form action="ProdutoControle" method="POST">
            
            <input type="hidden" name="action" value="listar" />
            <input type="search" id="idpesquisa" name="pesquisa" value="" placeholder="Enter ou digita o valor da pesquisa"/>
            <table aling="center" border="1px" width="100%"id="idtableproduto">

                <tr>
                    <th>Codigo</th>
                    <th>Descrição</th>
                    <th>Quantidade</th>
                    <th>Preço</th>
                    <th>Valor da compra</th>
                    <th>Data</th>
                    <th>Editar</th>
                    <th>Remover</th>
                </tr>
                <c:forEach var="p" items="${lista}">                
                    <tr>
                        <td>${p.codigo}</td>
                        <td>${p.descricao}</td>
                        <td>${p.qtd}</td>
                        <td>${p.preco}</td>
                        <td>${p.valor}</td>
                        <td>${p.data}</td>
                        <td> <a href="ProdutoControle?action=buscar&codigo=${p.codigo}">Editar</a></td>
                        <td> <a href="ProdutoControle?action=remover&codigo=${p.codigo}" onclick="return confirm('Atenção deseja excluir produto: ${p.descricao}')">Remover</a></td>
                    </tr>

                </c:forEach>
            </table>
        </form>
    </center>
</body>
</html>
