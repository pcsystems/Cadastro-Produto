package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProdutoControle", urlPatterns = {"/ProdutoControle"})
public class ProdutoControle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {

            String acao = request.getParameter("action");
            String resultado = "";

            switch (acao) {
                case "add":
                    resultado = new ProdutoService().save(request, response);
                    request.getRequestDispatcher(resultado).forward(request, response);
                    break;
                case "editar":
                    resultado = new ProdutoService().update(request, response);
                    request.getRequestDispatcher(resultado).forward(request, response);
                    break;
                case "listar":
                    resultado = new ProdutoService().getItem(request, response);
                    request.getRequestDispatcher(resultado).forward(request, response);
                    break;
                case "buscar":
                    resultado = new ProdutoService().getId(request, response);
                    request.getRequestDispatcher(resultado).forward(request, response);
                    break;
                case "remover":
                    resultado = new ProdutoService().delete(request, response);
                    request.getRequestDispatcher(resultado).forward(request, response);
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
    }

}
