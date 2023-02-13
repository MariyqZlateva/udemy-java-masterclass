package com.zlateva;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sidney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        boolean quitLoop = false;
        boolean forward = true;
        printActions();

        while (!quitLoop){
            if (!iterator.hasPrevious()){
                System.out.println("Originating : "+ iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()){
                System.out.println("Final : "+ iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String menuItem = getString();

            switch (menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward){
                        forward = true;
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if (forward){
                        forward = false;
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    printActions();
                    break;
                default : quitLoop = true;
                break;
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p:list){
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchIndex = 0;
        for (var listPlace : list){
            if (place.distance()<listPlace.distance()){
                list.add(matchIndex, place);
                return;
            }
            matchIndex++;
        }
        list.add(place);
    }

    private static void printActions(){
        String textFormat = """
                Available actions (select word or letter)
                (F)orward
                (B)ackward
                (L)list Places
                (M)enue
                (Q)uit""";
        System.out.println(textFormat);
    }
    private static String getString() {
        while (true) {
            try {
                String string = scanner.nextLine().toUpperCase().substring(0, 1);
                validateName(string);
                return string;
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
    }

    private static void validateName(String name) {
        if (name == null) {
            throw new RuntimeException("Name can not be null");
        }
        if (name.isEmpty()) {
            throw new RuntimeException("Name can not be empty");
        }
    }
}