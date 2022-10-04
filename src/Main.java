import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        int stepsMonthData = 0;

        while (true) {
            // обработка разных случаев
            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            int userInput = scanner.nextInt(); // повторное считывание данных от пользователя
            if (userInput == 1) {
                System.out.println("За какой месяц вы хотите внести количество пройденных шагов: 0-Январь, 1-Февраль, 2-Март, 3-Апрель, " +
                        "4-Май, 5-Июнь, 6-Июль, 7-Август, 8-Сентябрь, 9-Октябрь, 10-Ноябрь, 11-Декабрь?");
                int month = scanner.nextInt();
                System.out.println("Введите день месяца: от 1 до 30");
                int day = scanner.nextInt();
                System.out.println("Введите количество пройденных шагов:");
                int stepsDay = scanner.nextInt();
                stepsMonthData = stepTracker.saveStepsDay(month, day, stepsDay);

            } else if (userInput == 2) {
                System.out.println("За какой месяц вы хотите внести количество пройденных шагов: 0-Январь, 1-Февраль, 2-Март, 3-Апрель, " +
                        "4-Май, 5-Июнь, 6-Июль, 7-Август, 8-Сентябрь, 9-Октябрь, 10-Ноябрь, 11-Декабрь?");
                int month = scanner.nextInt();
                stepTracker.printStepsMonthToDay(month);

            } else if (userInput == 3) {
                System.out.println("Введите Вашу новую цель по количеству шагов за день:");
                int steps = scanner.nextInt();
                steps = stepTracker.TargetSteps(steps);
                //moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense, day);

            } else if ( userInput== 4) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день"); // вызвать метод TargetSteps
        System.out.println("4 - Выход");
    }
}
