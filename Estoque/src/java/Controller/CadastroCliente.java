package Controller;

import DataAccess.ClienteDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MetaData.*;

public class CadastroCliente implements Logica {

    @Override
    public String executa(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNome(request.getParameter("nome"));
        cliente.setCpf(Integer.valueOf(request.getParameter("cpf")));
        cliente.setTelefone(Integer.valueOf(request.getParameter("telefone")));
        cliente.setData(request.getParameter("data"));
        new ClienteDAO().Insert(cliente);
        return "/cadastro-cliente.jsp";
    }

}
