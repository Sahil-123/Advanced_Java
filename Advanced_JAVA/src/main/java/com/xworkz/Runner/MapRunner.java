package com.xworkz.Runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapRunner {

    public static void printMap(Map<?, ?> map){
        System.out.println();
        System.out.println("=========printing all keys=========");
        map.keySet().forEach(System.out::println);

        System.out.println();
        System.out.println("=========printing all values=========");
        map.values().forEach(System.out::println);

        System.out.println();
        System.out.println("=========printing all Key and value pairs=========");
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() +" : "+entry.getValue()));
    }

    public static void printFoodMap(Map<?, ?> map){
        System.out.println();
        System.out.println("=========printing all keys=========");
        map.keySet().forEach(System.out::println);

        System.out.println();
        System.out.println("=========printing all values=========");
        map.values().forEach(e-> System.out.println(Arrays.toString((String[])e)));

        System.out.println();
        System.out.println("=========printing all Key and value pairs=========");
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() +" : "+Arrays.toString((String[])entry.getValue())));
    }

    public static void main(String[] args) {

        System.out.println("--------------------T-Shirt-----------------");
        Map<String, String> tShirtMap = new HashMap<>();

        tShirtMap.put("Plain White T-Shirt", "Hanes");
        tShirtMap.put("Graphic Tee", "Nike");
        tShirtMap.put("V-Neck T-Shirt", "Adidas");
        tShirtMap.put("Polo Shirt", "Ralph Lauren");
        tShirtMap.put("Long Sleeve T-Shirt", "Under Armour");

//        printMap(tShirtMap);

        System.out.println("--------------------Wall and Color-----------------");
        Map<String, String> wallColorMap = new HashMap<>();

        wallColorMap.put("Living Room", "Beige");
        wallColorMap.put("Bedroom", "Light Blue");
        wallColorMap.put("Kitchen", "White");
        wallColorMap.put("Bathroom", "Pastel Yellow");
        wallColorMap.put("Study", "Gray");

//        printMap(wallColorMap);

        System.out.println("--------------------tv and its brands-----------------");
        Map<String, String> tvMap = new HashMap<>();

        tvMap.put("Samsung QLED Q90R", "Samsung");
        tvMap.put("Sony Bravia X900F", "Sony");
        tvMap.put("LG OLED C9", "LG");
        tvMap.put("Panasonic Viera GX800", "Panasonic");
        tvMap.put("Toshiba Fire TV Edition", "Toshiba");

//        printMap(tvMap);

        System.out.println("--------------------land and its owner-----------------");
        Map<String, String> landOwnershipMap = new HashMap<>();

        landOwnershipMap.put("Golden Gate Park", "City of San Francisco");
        landOwnershipMap.put("Central Park", "New York City");
        landOwnershipMap.put("Grand Canyon National Park", "United States Government");
        landOwnershipMap.put("Eiffel Tower", "City of Paris");
        landOwnershipMap.put("Taj Mahal", "Government of India");

//        printMap(landOwnershipMap);

        System.out.println("-------------------------------------");
        Map<String, Integer> carModelMap = new HashMap<>();

        carModelMap.put("Toyota Corolla", 2022);
        carModelMap.put("Honda Civic", 2023);
        carModelMap.put("Ford Mustang", 2021);
        carModelMap.put("Tesla Model S", 2024);
        carModelMap.put("BMW 3 Series", 2022);

//        printMap(carModelMap);

        System.out.println("--------------------food and its ingredients list-----------------");
        Map<String, String[]> foodIngredientsMap = new HashMap<>();

        foodIngredientsMap.put("Spaghetti Bolognese", new String[]{"Spaghetti", "Ground beef", "Tomato sauce", "Onion", "Garlic"});
        foodIngredientsMap.put("Caesar Salad", new String[]{"Romaine lettuce", "Chicken breast", "Parmesan cheese", "Croutons", "Caesar dressing"});
        foodIngredientsMap.put("Hamburger", new String[]{"Ground beef patty", "Burger bun", "Lettuce", "Tomato", "Onion"});
        foodIngredientsMap.put("Chicken Curry", new String[]{"Chicken breast", "Curry paste", "Coconut milk", "Potato", "Onion"});
        foodIngredientsMap.put("Caprese Salad", new String[]{"Tomato", "Fresh mozzarella cheese", "Basil leaves", "Balsamic glaze", "Olive oil"});

        printFoodMap(foodIngredientsMap);
    }
}
