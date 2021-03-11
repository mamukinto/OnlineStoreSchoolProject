package services.dao;

import model.User;

public interface UserDAO {
    void addUser(User user);
    void getUsers();
}
