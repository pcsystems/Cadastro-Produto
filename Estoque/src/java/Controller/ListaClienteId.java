package Controller;

import DataAccess.*;
import MetaData.Cliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaClienteId implements Logica {

    @Override
    public String executa(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        Cliente c = new ClienteDAO().Get(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("c", c);
        return "editar-cliente.jsp";
    }

}
