package org.example;

import org.example.excercise.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        LambdasExercise01 obj1 = new LambdasExercise01();
        obj1.sortProductsByName(ExampleData.getProducts());
        System.out.println("******************");
        LambdasExercise02 obj2 = new LambdasExercise02();
        obj2.findProductsByCategory(ExampleData.getProducts(),Category.OFFICE)
                .stream().forEach(System.out::println);
        System.out.println("******************");
        FunctionalInterfacesExercise01 obj3 = new FunctionalInterfacesExercise01();
        obj3.filterProducts(ExampleData.getProducts(), a-> a.getCategory().equals(Category.CLEANING))
                .forEach(System.out::println);
        System.out.println("******************");
        //obj3.filterProducts(ExampleData.getProducts(),a->a.getName().contains("Dish"))
          //      .forEach(System.out::println);
        FunctionalInterfacesExercise02 obj4 = new FunctionalInterfacesExercise02();
        Predicate<Product> searchPredicate = obj4.createSearchPredicate
                (new FunctionalInterfacesExercise02.SearchCriteria(Category.FOOD,
                        "", new BigDecimal(0.0), new BigDecimal(1.0)));
        ExampleData.getProducts().stream().filter(a->a.getCategory().equals(Category.OFFICE)).findFirst()
                .ifPresentOrElse(System.out::println,()->System.out.println("No records found"));
        System.out.println("*********");
        BasicStreamsExercise01 basicStreamsExercise01 = new BasicStreamsExercise01();
        basicStreamsExercise01.findUtensilsSortedByName(ExampleData.getProducts()).forEach(System.out::println);
        System.out.println("******03***");
        BasicStreamsExercise03 basicStreamsExercise03 = new BasicStreamsExercise03();
        basicStreamsExercise03.findProductCheaperThan(ExampleData.getProducts(), new BigDecimal("5.00"))
                .ifPresentOrElse(System.out::println,()->System.out.println("No records found"));

    }
}