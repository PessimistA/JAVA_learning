package deneme;

import java.util.InputMismatchException;
import java.util.Scanner;
class ExceptionHandling12 {
    public static void one() {
        int[] numbers = {10, 20, 30, 40};
        String text = null;
        String invalidNumber = "abc";

        System.out.println("Program başladı.");

        try {
            int result = 100 / 0;
            System.out.println("Bölme sonucu: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            System.out.println("5. eleman: " + numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            System.out.println("Text uzunluğu: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            int parsed = Integer.parseInt(invalidNumber);
            System.out.println("Parsed sayı: " + parsed);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        try {
            Object obj = "merhaba";
            Integer sayi = (Integer) obj;  // Bu hatalı downcasting
            System.out.println(sayi);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        try {
            Scanner scanner = new Scanner("abc"); // sayı yerine harf girişi
            int sayi = scanner.nextInt();         // burada InputMismatchException oluşur
            System.out.println("Girilen sayı: " + sayi);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        }



        System.out.println("ve bitti.");
    }
}

public class exceptionHandling {
	public static void main(String[] args) {
		ExceptionHandling12.one();
	}
}
