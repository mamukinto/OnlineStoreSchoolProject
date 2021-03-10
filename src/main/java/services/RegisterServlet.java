package services;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String number = req.getParameter("number");
        String password = req.getParameter("password");

        User newUser = new User(username,lastName,password,number,email," ");

//        [TODO] ეს უნდა მუშაობდეს
//        UserDAO userDAO = new UserDAOImpl();
//        userDAO.addUser(newUser);
    }
}
