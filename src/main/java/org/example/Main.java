package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] items = {"Bread", "Cheese", "Butter", "Tea", "Potato", "Tomato", "Onion", "Coffe", "Yogurt Drink", "Mineral Water"};
//        System.out.println(items.length);

//        int[][] row = {{10, 20, 30}, {100, 200, 300}};
//        System.out.println(row[1][0]);

//        String[] castNames = new String[6];
//        castNames[0] = "Zareyee Merila";
//        castNames[1] = "Hosseini Shahab";
//        castNames[2] = "Bayat Sareh";
//        castNames[3] = "Moadi Peyman";
//        castNames[4] = "Hatami Leila";
//        castNames[5] = "Farhadi Sarina";
//
        Arrays.sort(castNames);
//
//        for (int i = 0; i < castNames.length; i++) {
//            System.out.println((i + 1) + " : " + castNames[i]);
//        }
//
//        int[] numbers = {30, 40, 20};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));


        int[] monthNames = new int[12];
        monthNames[0] = 500_000;
        monthNames[1] = 1_500_000;
        monthNames[2] = 1_300_000;
        monthNames[3] = 1_700_000;
        monthNames[4] = 2_500_000;
        monthNames[5] = 500_000;
        monthNames[6] = 1_500_000;
        monthNames[7] = 1_000_000;
        monthNames[8] = 750_000;
        monthNames[9] = 500_000;
        monthNames[10] = 1_400_000;
        monthNames[11] = 1_100_000;

        int total = 0;
//        for (int i = 0; i < monthNames.length; i++) {
//            total += monthNames[i];
//        }
//        int avaergeIncome = total / monthNames.length;
//        System.out.println("Your avarage income is " + avaergeIncome);

        for (int counter: monthNames) {
            total+= counter;
        }

        int avaergeIncome = total / monthNames.length;
        System.out.println("Your avarage income is " + avaergeIncome);
    }
}