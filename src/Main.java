import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum=0;
        int numberSubjects;
        double averageMark;
        Scanner NumScanner = new Scanner(System.in);

        System.out.println("Введите количество предметов: ");

        numberSubjects = NumScanner.nextInt();

        for (int x = 1; x <= numberSubjects; x++) {
            System.out.println("Введите оценку за " + x + " предмет:");
            int mark = NumScanner.nextInt();
            if (mark > 10 || mark <= 0) {

                System.out.println("Ошибка! Введите оценку от 1 до 10.");
            }

            sum = sum + mark;
            System.out.println();
        }

        averageMark = (sum / numberSubjects);
        System.out.println("Средняя оценка: " + averageMark);
    }
}
