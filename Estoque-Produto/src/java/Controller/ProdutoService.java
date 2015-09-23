package Controller;

import DataAccess.ProdutoDAO;
import MetaData.Produto;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProdutoService implements Logica {

    ProdutoDAO dao;

    public ProdutoService() throws Exception {

        dao = new ProdutoDAO();

    }

    @Override
    public String save(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Produto p = new Produto();
        p.setDescricao(request.getParameter("descricao"));
        p.setQtd(Integer.parseInt(request.getParameter("qtd")));
        p.setPreco(Double.parseDouble(request.getParameter("preco")));
        p.setValor(Double.parseDouble(request.getParameter("valor")));
        p.setData(request.getParameter("data"));
        dao.Insert(p);
        return "/cadastro-produto.jsp";
    }

    @Override
    public String update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Produto p = new Produto();
        p.setCodigo(Integer.parseInt(request.getParameter("codigo")));
        p.setDescricao(request.getParameter("descricao"));
        p.setQtd(Integer.parseInt(request.getParameter("qtd")));
        p.setPreco(Double.parseDouble(request.getParameter("preco")));
        p.setValor(Double.parseDouble(request.getParameter("valor")));
        p.setData(request.getParameter("data"));
        dao.Update(p);
        return "/lista-produto.jsp";

    }

    @Override
    public String delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Produto p = dao.Get(Integer.parseInt(request.getParameter("codigo")));
        dao.Delete(p);
        return "/lista-produto.jsp";
    }

    @Override
    public String getAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Produto> lista = new ProdutoDAO().GetAll();
        request.setAttribute("lista", lista);
        return "";
    }

    @Override
    public String getId(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Produto p = dao.Get(Integer.parseInt(request.getParameter("codigo")));
        request.setAttribute("p", p);
        return "/editar-produto.jsp";

    }

    @Override
    public String getItem(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Produto> lista = dao.getProdutoItem(request.getParameter("pesquisa"));
        request.setAttribute("lista", lista);
        return "lista-produto.jsp";
    }

    public String getDescricao(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Produto p = dao.Get(request.getParameter("descricao"));
        request.setAttribute("p", p);
        return "/editar-produto.jsp";

    }

}
