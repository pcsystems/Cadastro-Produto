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
        <title>Produto</title>
        <link rel="stylesheet" href="produtocss.css"/>
    </head>
    <body>
    <center>
        <form action="ProdutoControle" method="POST">
            

            <table aling="center" border="0" width="1" id="table-cadatro">

                <tr>
                    <td><input type="hidden" id="txt" name="codigo" value="${p.codigo}"/></td>
                </tr>

                <tr>
                    <td><input type="text" id="txt" name="descricao" value="${p.descricao}" required="" placeholder="Digite produto"/></td>
                </tr>
                <tr>
                    <td><input type="text" id="txt" name="qtd" value="${p.qtd}" required="" placeholder="Digite a quantidade"/></td>
                </tr>
                <tr>
                    <td><input type="text" id="txt" name="preco" value="${p.preco}" required="" placeholder="Digite o preço" /></td>
                </tr>
                <tr>
                    <td><input type="text" id="txt" name="valor" value="${p.valor}" required="" placeholder="Digite o valor" /></td>
                </tr>
                <tr>
                    <td><input type="date" id="txtdata" name="data"  value="${p.data}" required=""/></td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" id="btn-salvar-produto" name="action" value="Editar"/>
                        <input type="submit" id="btn-salvar-produto" name="action" value="Cancelar"/>
                         <input type="submit" id="btn-salvar-produto" name="action" value="Deletar" onclick="return confirm('Deseja Excluir produto: ${p.descricao}')"/>                                                                      
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
