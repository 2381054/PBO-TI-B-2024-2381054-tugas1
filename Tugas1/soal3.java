package Tugas1;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan kata camelCase: ");
        String camelCase = scanner.nextLine();
        scanner.close();

        int kataCount = 1;
        for (int i = 1; i < camelCase.length(); i++) {
            if (Character.isUpperCase(camelCase.charAt(i))) {

                kataCount++;
            }

        }
        System.out.println("Jumlah kata dalam " + camelCase + " : " + kataCount);
    }
}
