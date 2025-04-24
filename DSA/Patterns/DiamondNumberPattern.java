package com.Anjani;

//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//    3 2 1 2 3
//      2 1 2
//        1

public class DiamondNumberPattern {
    public static void main(String[] args) {
        pattern8(4);  // 4 rows in top half
    }

    static void pattern8(int n) {
        // Top half
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  "); // two spaces for better alignment
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

        // Bottom half
        for (int row = n - 1; row >= 1; row--) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
