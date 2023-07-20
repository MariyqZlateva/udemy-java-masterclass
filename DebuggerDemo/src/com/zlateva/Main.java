package com.zlateva;

public class Main {
    public static void main(String[] args) {
        StringUtilities utilities = new StringUtilities();
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        while (sb.length() < 10){
            utilities.addChar(sb, 'a');
//            counter ++;
//            if (counter == 10){
//                break;
//            }
        }
        System.out.println("String builder value = "+sb);

        String str = "abcdefg";
        String result = utilities.upperAndPrefix(utilities.addSuffix(str));
    }
}