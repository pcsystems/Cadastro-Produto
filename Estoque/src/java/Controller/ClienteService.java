package Controller;

import DataAccess.ClienteDAO;
import MetaData.Cliente;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteService implements Logica {

    ClienteDAO dao;

    public ClienteService() throws Exception {

        dao = new ClienteDAO();

    }

    @Override
    public String save(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNome(request.getParameter("nome"));
        cliente.setCpf(Integer.valueOf(request.getParameter("cpf")));
        cliente.setTelefone(Integer.valueOf(request.getParameter("telefone")));
        cliente.setData(request.getParameter("data"));
        dao.Insert(cliente);
        return "/cadastro-cliente.jsp";
    }

    @Override
    public String update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNome(request.getParameter("nome"));
        cliente.setCpf(Integer.parseInt(request.getParameter("cpf")));
        cliente.setTelefone(Integer.parseInt(request.getParameter("telefone")));
        cliente.setData(request.getParameter("data"));
        cliente.setCodigo(Integer.parseInt(request.getParameter("codigo")));
        dao.Update(cliente);
        return "/lista-cliente.jsp";
    }

    @Override
    public String delete(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Cliente c = dao.Get(Integer.parseInt(request.getParameter("id")));
        dao.Delete(c);
        return "/lista-cliente.jsp";
    }

    @Override
    public String getAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Cliente> lista = dao.GetAll();
        request.setAttribute("lista", lista);
        return "lista-cliente.jsp";
    }

    @Override
    public String getId(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Cliente c = dao.Get(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("c", c);
        return "editar-cliente.jsp";
    }

    @Override
    public String getItem(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Cliente> lista = dao.getClienteItem(request.getParameter("pesquisa"));
        request.setAttribute("lista", lista);
        return "lista-cliente.jsp";
    }

}
