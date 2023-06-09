package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void add(User user);
    User getUserById(Long id);
    List<User> listUsers();
    void updateUser(User user);
    void deleteUser(Long id);
}
