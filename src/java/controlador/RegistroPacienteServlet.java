package controlador;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistroPacienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().println("Solicitud GET recibida correctamente.");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String documento = request.getParameter("documento");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");

        request.setAttribute("nombre", nombre);
        request.setAttribute("apellido", apellido);
        request.setAttribute("documento", documento);
        request.setAttribute("telefono", telefono);
        request.setAttribute("direccion", direccion);

        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}