package org.avramdiana.proiect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti coeficientul a:");
        double a = scanner.nextDouble();

        System.out.println("Introduceti coeficientul b:");
        double b = scanner.nextDouble();

        System.out.println("Introduceti coeficientul c:");
        double c = scanner.nextDouble();

        double delta = calculateDelta(a, b, c);
        System.out.println("Delta: " + delta);

        scanner.close();
    }

    public static double calculateDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}