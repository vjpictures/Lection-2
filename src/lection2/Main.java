package lection2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        int numberSubjects;
        double averageMark;
        Scanner numScanner = new Scanner(System.in);

        System.out.println("Введите количество предметов: ");

        numberSubjects = numScanner.nextInt();

        for (int x = 1; x <= numberSubjects; x++) {
            System.out.println("\nВведите оценку за " + x + " предмет:");
            int mark = numScanner.nextInt();
            if (mark > 10 || mark <= 0) {

                System.out.println("Ошибка! Введите оценку от 1 до 10.");
                return;
            }

            sum = sum + mark;
        }

        averageMark = (sum / numberSubjects);
        System.out.println("Средняя оценка: " + averageMark);
    }
}
