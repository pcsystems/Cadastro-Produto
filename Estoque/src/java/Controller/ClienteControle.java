package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ClienteControle", urlPatterns = {"/ClienteControle"})
public class ClienteControle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            String acao = request.getParameter("action");
            String res = "";
            switch (acao) {
                case "add":
                    res = new CadastroCliente().executa(request, response);
                    request.getRequestDispatcher(res).forward(request, response);
                    break;
                case "listar":
                    res = new ListaClienteLike().executa(request, response);
                    request.getRequestDispatcher(res).forward(request, response);
                    break;
                case "busca":
                    res = new ListaClienteId().executa(request, response);
                    request.getRequestDispatcher(res).forward(request, response);
                    break;
                case "editar":
                    res = new UpdateCliente().executa(request, response);
                    request.getRequestDispatcher(res).forward(request, response);
                    break;
                case "remover":
                    res = new RemoveCliente().executa(request, response);
                    request.getRequestDispatcher(res).forward(request, response);
                    break;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
