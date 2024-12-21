package org.example;

import org.example.excercise.LambdasExercise01;
import org.example.excercise.LambdasExercise02;

import java.util.List;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        LambdasExercise01 obj1 = new LambdasExercise01();
        obj1.sortProductsByName(ExampleData.getProducts());
        System.out.println("******************");
        LambdasExercise02 obj2 = new LambdasExercise02();
        obj2.findProductsByCategory(ExampleData.getProducts(),Category.OFFICE)
                .stream().forEach(System.out::println);
    }
}