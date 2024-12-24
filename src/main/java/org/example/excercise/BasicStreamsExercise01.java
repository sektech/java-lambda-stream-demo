package org.example.excercise;

import org.example.Category;
import org.example.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamsExercise01 {

    /**
     * Exercise 1: In a list of products, find the products that are in the category UTENSILS and sort them by name.
     *
     * @param products A list of products.
     * @return A list of products that are utensils, sorted by name.
     */
    public List<Product> findUtensilsSortedByName(List<Product> products) {
        // TODO: Add three stream operation methods:
        //
        // 1) Find the products that are in the category UTENSILS
        // 2) Sort them by name
        // 3) Collect the result into a List
        //
        // Hint: Use the API documentation of interface java.util.stream.Stream.

//        return products.stream()...;
          return products.stream()
                  .filter(a-> a.getCategory().equals(Category.UTENSILS))
                  .sorted((p1,p2)->p1.getName().compareToIgnoreCase(p2.getName()))
                  .collect(Collectors.toList());
        //throw new UnsupportedOperationException("Not yet implemented"); // Remove this line
    }
}
