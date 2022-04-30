package ru.test;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int i = 1;
        while (i <=10) {
            System.out.print(i + " ");
            i ++;
        }
        System.out.println("\n");
        for (int n = 10; n>0; n--) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
        // Task 2
        int friday = 3;
        while (friday <=31){
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо сдать отчет");
            friday = friday + 7;
        }
        // Task 3
        int comet = 0;
        int currentYear = 2021;
        int beforeYear = currentYear - 200;
        int afterYear = currentYear + 100;
        for (; comet < 3000; comet = comet + 79) {
            if (comet > beforeYear && comet < afterYear) {
                System.out.println(comet);
            }
        }
    }
}