package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {

    public String save(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public String update(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public String delete(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public String getAll(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public String getId(HttpServletRequest request, HttpServletResponse response) throws Exception;
    public String getItem(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
