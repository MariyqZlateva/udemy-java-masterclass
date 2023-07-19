package com.zlateva;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String challenge1 = "I want a bike.";

        System.out.println(challenge1.matches("I want a bike."));
        String regExp = "I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        String challenge2 = "I want a ball.";
        System.out.println(challenge2.matches(regExp));

        String regExp1 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        String challenge4 = "Replace all blanks with underscore";
        System.out.println("4. " + challenge4.replaceAll(" ", "_"));
        System.out.println("4. " + challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aaabbbccccccccdddefffg";
        System.out.println(challenge5.matches("a{3}b{3}c{8}d{3}ef{3}g"));
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        System.out.println("5. " + challenge5.matches("^a{3}b{3}c{8}d{3}ef{3}g$"));
        System.out.println("6. " + challenge5.replaceAll("^a{3}b{3}c{8}d{3}ef{3}g$", "REPLACED"));

        String challenge7 = "abcd.135";
        String regExp7 = "[a-z].+";
        Pattern pattern7 = Pattern.compile(regExp7);
        Matcher matcher7 = pattern7.matcher(challenge7);
        System.out.println("7. " + matcher7.matches());

        System.out.println("7. " + challenge7.matches("^[A-z][a-z]+\\.\\d+$"));

        String challenge8 = "abc.135uvqz.7tzik.999";
        String regExp8 = "[A-Za-z]+\\.(\\d+)";
        Pattern pattern8 = Pattern.compile(regExp8);
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()) {
            System.out.println("Occurrence:" + matcher8.group(1));
        }
        String challenge9 = "abc.135\tuvqz.7\ttzik.999\n";
        String regExp9 = "[A-Za-z]+\\.(\\d+)\\s";
        Pattern pattern9 = Pattern.compile(regExp9);
        Matcher matcher9 = pattern9.matcher(challenge9);
        while (matcher9.find()) {
            System.out.println(matcher9.group(1));
        }

        String challenge10 = "abc.135\tuvqz.7\ttzik.999\n";
        String regExp10 = "[A-Za-z]+\\.(\\d+)\\s";
        Pattern pattern10 = Pattern.compile(regExp10);
        Matcher matcher10 = pattern10.matcher(challenge10);
        while (matcher10.find()) {
            System.out.println("Start position " + matcher10.start(1) + ", end position: " + (matcher10.end(1) - 1));
        }

        String challenge11 = " {0,2},{0,5},{1,3},{2,4}";
        String regExp11 = "\\{(.+?)\\}";
        Pattern pattern11 = Pattern.compile(regExp11);
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()) {
            System.out.println("Occurrence11: " + matcher11.group(1));
        }

        String challenge11a = "{0, 2},{0, 5},{1, 3},{2, 4},{x, y},{2, 4},{11, 12}";
        String regExp11a = "\\{(\\d+, \\d+)\\}";
        Pattern pattern11a = Pattern.compile(regExp11a);
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while (matcher11a.find()) {
            System.out.println("Occurrence11a: " + matcher11a.group(1));
        }

        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        String challenge13 = "11111-1111";
        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));
    }
}