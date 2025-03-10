package ru.kch.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.kch.model.User;

@Component
public class ExampleCommandLineRunner implements CommandLineRunner {
    private final UserService userService;

    public ExampleCommandLineRunner(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create and save a new user
        User user = new User();
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
