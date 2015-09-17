package Controller;

import DataAccess.*;
import MetaData.Cliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveCliente implements Logica {

    @Override
    public String executa(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ClienteDAO dao = new ClienteDAO();
        Cliente c = dao.Get(Integer.parseInt(request.getParameter("id")));
        dao.Delete(c);
        return "/lista-cliente.jsp";
    }

}
