package ru.kch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kch.model.User;
import ru.kch.service.UserService;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.kch");
        UserService userService = context.getBean(UserService.class);

        // Create and save a new user
        User user = new User();
        user.setId(1L);
        user.setUsername("JohnDoe");
        userService.createUser(user);

        // Retrieve user by ID
        System.out.println("User found: " + userService.findUserById(1L).map(Object::toString).orElse("Not found"));

        // Retrieve all users
        System.out.println("All users: " + userService.findAll());

        // Delete user
        userService.deleteUser(user);
        System.out.println("All users after deletion: " + userService.findAll());
    }
}
