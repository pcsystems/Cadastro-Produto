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
        <title>Cadastro de produto</title>
        <link rel="stylesheet" href="css.css"/>
    </head>
    <body id="idimagen">
        <a href="index.html" id="idindex">Home</a>
    <center>
        <h1 id="h1produto">Cadastro de produto</h1>
        <hr id="hrproduto">
        <form action="ProdutoControle" method="POST">
            <input type="hidden" name="action" value="add"/>

            <table border="0" width="1">
                <tr>
                    <td><input type="text" id="txtProduto" name="descricao" value="" required="" placeholder="Digite produto"/></td>
                </tr>
                <tr>
                    <td><input type="text" id="txtProduto" name="qtd" value="" required="" placeholder="Digite a quantidade"/></td>
                </tr>
                <tr>
                    <td><input type="text"  id="txtProduto" name="preco" value="" required="" placeholder="Digite o preço" /></td>
                </tr>
                <tr>
                    <td><input type="text" id="txtProduto" name="valor" value="" required="" placeholder="Digite o valor" /></td>
                </tr>
                <tr>
                    <td><input type="date" id="txtProduto" name="data"  value="" required=""/></td>
                </tr>
                <tr>
                    <td><input type="submit" id="txtProduto" value="Salvar" name="salvar"/></td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
