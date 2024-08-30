/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Soal5 {
    // function compare to lexicography

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.nextLine();
        String B = scan.nextLine();

        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        if (A.compareTo(B) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scan.close();
    }
}