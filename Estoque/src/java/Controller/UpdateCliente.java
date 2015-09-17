package Controller;

import DataAccess.ClienteDAO;
import MetaData.Cliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateCliente implements Logica {

    @Override
    public String executa(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNome(request.getParameter("nome"));
        cliente.setCpf(Integer.parseInt(request.getParameter("cpf")));
        cliente.setTelefone(Integer.parseInt(request.getParameter("telefone")));
        cliente.setData(request.getParameter("data"));
        cliente.setCodigo(Integer.parseInt(request.getParameter("codigo")));
        new ClienteDAO().Update(cliente);
        return "/lista-cliente.jsp";
    }
}
