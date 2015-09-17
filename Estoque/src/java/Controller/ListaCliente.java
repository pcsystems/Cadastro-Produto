package Controller;

import DataAccess.*;
import MetaData.Cliente;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaCliente implements Logica {

    @Override
    public String executa(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        List<Cliente> lista = new ClienteDAO().GetAll();
        request.setAttribute("lista", lista);
        return "lista-cliente.jsp";
    }

}
