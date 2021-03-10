package services;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    //        [TODO] ეს უნდა მუშაობდეს
            List<User> users = new ArrayList<>();
    //        UserDAO userDAO = new UserDAOImpl();
    //        users = userDAO.getUsers();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        if (checkIfUserExists(email)) {
            users.forEach(user -> {
                if (user.getEmail().equals(email)) {
                    if (user.getPassword().equals(password)) {
                        System.out.println("Logged in!");
                    }
                    else {
                        System.out.println("Wrong password!");
                    }
                }
            });
        }


    }
    private boolean checkIfUserExists(String email) {

        AtomicBoolean result = new AtomicBoolean(false);


        users.forEach(user -> {
            if (user.getEmail().equals(email)) {
                result.set(true);
            }
        });
        return result.get();
    }
}
