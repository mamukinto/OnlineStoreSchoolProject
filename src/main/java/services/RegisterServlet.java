package services;

import model.User;
import services.Dao.userDao;
import services.Dao.userDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("username");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String number = req.getParameter("number");
        String password = req.getParameter("password");

        User newUser = new User(firstname,lastName,password,number,email," ");

        userDao userDAO = new userDaoImpl();
        userDAO.addUsers(newUser);
    }
}
