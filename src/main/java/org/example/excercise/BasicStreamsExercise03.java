package org.example.excercise;


import org.example.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BasicStreamsExercise03 {

    /**
     * Exercise 3: In a list of products, find a product that is cheaper than a price limit.
     *
     * @param products   A list of product.
     * @param priceLimit The price limit.
     * @return An Optional containing a product from the list that is cheaper than the price limit,
     * or an empty Optional if there is no such product in the list.
     */
    public Optional<Product> findProductCheaperThan(List<Product> products, BigDecimal priceLimit) {
        // TODO: Find any product in the list that is cheaper than the given price limit.
        //
        // Hint: You'll need to add two stream operations.

//        return products.stream()...;
        return products.stream()
                .filter(a->a.getPrice().compareTo(priceLimit) > 0)
                .findAny();

    }
}
