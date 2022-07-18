package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {
     List<User> getAllUsers ();
    User getUserById(long id);

    void saveUser (User user);

    void deleteById(long id);
void updateUser(long id);
}
