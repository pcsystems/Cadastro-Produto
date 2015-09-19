<%-- 
    Document   : cadastroProduto
    Created on : 19/09/2015, 08:47:45
    Author     : tiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css.css"/>
        <title>Produto</title>
    </head>
    <body id="idimagen">
    <center>
        <h1 id="h1produto">Atualização de produto</h1>
        <hr>
        <form action="ProdutoControle" method="POST">
            <input type="hidden" name="action" value="editar"/>

            <table border="0" width="1">
                
                <tr>
                    <td><input type="hidden" id="txtProduto" name="codigo" value="${p.codigo}"/></td>
                </tr>
                
                <tr>
                    <td><input type="text" id="txtProduto" name="descricao" value="${p.descricao}" required="" placeholder="Digite produto"/></td>
                </tr>
                <tr>
                    <td><input type="text" id="txtProduto" name="qtd" value="${p.qtd}" required="" placeholder="Digite a quantidade"/></td>
                </tr>
                <tr>
                    <td><input type="text" id="txtProduto" name="preco" value="${p.preco}" required="" placeholder="Digite o preço" /></td>
                </tr>
                <tr>
                    <td><input type="text" id="txtProduto" name="valor" value="${p.valor}" required="" placeholder="Digite o valor" /></td>
                </tr>
                <tr>
                    <td><input type="date" id="txtProduto" name="data"  value="${p.data}" required=""/></td>
                </tr>
                <tr>
                    <td><input type="submit" id="txtProduto" value="Salvar" name="salvar"/></td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
