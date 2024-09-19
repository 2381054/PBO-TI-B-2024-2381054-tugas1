package Tugas1;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan ukuran tangga (n) ");
        int n = scanner.nextInt();
        cetakTangga(n);
    }

    public static void cetakTangga(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.println("#");

            }
            System.out.println();
        }
    }
}
