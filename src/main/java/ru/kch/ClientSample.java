package ru.kch;

import org.springframework.web.client.RestClient;

import java.util.List;

public class ClientSample {
    private static final String BASE_URL = "http://localhost:8080/v1/product";
    private static final RestClient restClient = RestClient.create();

    public static void main(String[] args) {
        findAllProducts();
        findByUser(1L);
        getProductById(1L);
    }

    private static void findAllProducts() {
        List<?> products = restClient.get()
                .uri(BASE_URL)
                .retrieve()
                .body(List.class);

        System.out.println("All Products: " + products);
    }

    private static void findByUser(Long userId) {
        List<?> products = restClient.get()
                .uri(BASE_URL + "/by-user?user_id=" + userId)
                .retrieve()
                .body(List.class);

        System.out.println("Products for User " + userId + ": " + products);
    }

    private static void getProductById(Long id) {
        Object product = restClient.get()
                .uri(BASE_URL + "/" + id)
                .retrieve()
                .body(Object.class);

        System.out.println("Product with ID " + id + ": " + product);
    }
}
