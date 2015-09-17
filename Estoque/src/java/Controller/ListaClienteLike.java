package Controller;

import DataAccess.*;
import MetaData.Cliente;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaClienteLike implements Logica {

    @Override
    public String executa(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> lista = dao.getClienteItem(request.getParameter("pesquisa"));
        request.setAttribute("lista", lista);
        return "lista-cliente.jsp";
    }

}
