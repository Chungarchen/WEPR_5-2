package murach.survey;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import murach.business.User;

public class SurveyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String heardFrom = nvl(request.getParameter("heardFrom"), "N/A");

        // checkbox không tick => null
        boolean updates = request.getParameter("updates") != null;

        String contactVia = nvl(request.getParameter("contactVia"), "N/A");

        User user = new User(email, firstName, lastName, heardFrom, updates, contactVia);
        request.setAttribute("user", user);

        getServletContext()
                .getRequestDispatcher("/survey.jsp")
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    private String nvl(String s, String def) {
        return (s == null || s.isBlank()) ? def : s;
    }
}
