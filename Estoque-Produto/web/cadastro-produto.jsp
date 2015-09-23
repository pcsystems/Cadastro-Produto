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
        <link rel="stylesheet" href="produtocss.css"/>
    </head>
    <body>

    <center>

        <form action="ProdutoControle" method="POST">
            <input type="hidden" name="action" value="add"/>

            <table aling="center" border="0" width="1" id="table-cadatro">
                <tr>
                    <td><a href="lista-produto.jsp" id="txtlista">Pesquisa</a></td>
                </tr>

                <tr>
                    <td><input type="text" id="txt" name="descricao" value="" required="" placeholder="Digite produto"/></td>
                </tr>
                <tr>
                    <td><input type="text" id="txt" name="qtd" value="" required="" placeholder="Digite a quantidade"/></td>
                </tr>
                <tr>
                    <td><input type="text"  id="txt" name="preco" value="" required="" placeholder="Digite o preço" /></td>
                </tr>
                <tr>
                    <td><input type="text" id="txt" name="valor" value="" required="" placeholder="Digite o valor da compra" /></td>
                </tr>
                <tr>
                    <td><input type="date" id="txtdata" name="data"  value="" required=""/></td>
                </tr>
                <tr>
                    <td><input type="submit" id="btn-salvar-produto" value="Salvar" name="salvar"/></td>
                </tr>
                 
            </table>
        </form>
    </center>
</body>
</html>
