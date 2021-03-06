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
                    res = new ClienteService().save(request, response);
                    request.getRequestDispatcher(res).forward(request, response);
                    break;
                case "listar":
                    res = new ClienteService().getItem(request, response);
                    request.getRequestDispatcher(res).forward(request, response);
                    break;
                case "busca":
                    res = new ClienteService().getId(request, response);
                    request.getRequestDispatcher(res).forward(request, response);
                    break;
                case "editar":
                    res = new ClienteService().update(request, response);
                    request.getRequestDispatcher(res).forward(request, response);
                    break;
                case "remover":
                    res = new ClienteService().delete(request, response);
                    request.getRequestDispatcher(res).forward(request, response);
                    break;

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
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
