import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();



        while (true) {

            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                stepTracker.addCountStepsPerDay();
            } else if (userInput == 2) {
                stepTracker.outputStatisticsStepsMonth();
            } else if (userInput == 3) {
                stepTracker.TargetSteps();
            } else if ( userInput== 4) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    private static void printMenu() {
        System.out.println(" ");
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("4 - Выход");
    }
}
