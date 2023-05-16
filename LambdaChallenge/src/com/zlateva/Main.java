package com.zlateva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Function<String, String> everySecondCharFunc = (source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondChar(everySecondCharFunc, "1234567890"));

        Supplier<String> iLoveJava = () -> "I love Java!";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        List<String> topNames2015 = Arrays.asList(
                "Amelia", "Olivia", "emily", "Isla", "Ava",
                "oliver", "Jack", "Charlie", "harry", "Jacob"
        );

        List<String> firstUpperCase = new ArrayList<>();
        topNames2015.forEach(name ->
                firstUpperCase.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
        firstUpperCase.sort(String::compareTo);
        firstUpperCase.forEach(System.out::println);
        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);
        System.out.println("------------------------------------------------");
        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        long namesBeginningWithA = topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .filter(names -> names.startsWith("A"))
                .count();

        System.out.println("Numbers beginning with A is: "+namesBeginningWithA);
    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondChar(Function<String, String> func, String source) {
        return func.apply(source);
    }
}