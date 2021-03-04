package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    public void add(User user);

    public List<User> listUsers();

    public User getUsersByCar(String model, int series);
}
