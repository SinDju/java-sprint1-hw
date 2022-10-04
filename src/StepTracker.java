import java.util.Scanner;

public class StepTracker {

    int[][] monthToData;
    int targetSteps = 10000; // может надо перенести в майн

    public StepTracker() {
        monthToData = new int [12][30];
        for (int i = 0; i < monthToData.length; i++) {
            for (int j = 0; j < monthToData[0].length; j++) {
                monthToData[i][j] = 0;
            }
        }
    }
     int TargetSteps (int steps) {

        if (steps>0) {
            System.out.println("Ваша новая цель по количеству шагов на день: "+ steps);
        }
        else {
            System.out.println("Извините, целевое количества шагов не может быть отрицательным.");
        }
        return steps;
        // метод меняет цель по шагам
    }
    int saveStepsDay(int month, int day, int stepsDay) {
        //Как реализовать- Если за какой-то день статистика
        // не сохранялась, то считаем количество шагов в этот день равным 0.
        if (stepsDay >0) {
            monthToData[month][day-1] = stepsDay;
            System.out.println("Месяц: " + month + "." + " День: " + day + "." + " Сделано "
                    + monthToData[month][day-1] + " шагов.");
        }
        else {
            System.out.println("Извините, введеное количества шагов не может быть отрицательным.");
        }
        return monthToData[month][day-1] ;
    }

    void printStepsMonthToDay(int month) {

            for (int j = 0; j < 30; j++) {
                System.out.println("Месяц: "+ month + "." + "День: "+ (j+1)  + "." +  "Сделано "
                        + monthToData[month][j]  + " шагов.");
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы

    }

    class MonthData {

         void saveStepsDay() {
             /*Сохранение количества шагов за день. Пользователь должен указать
             номер месяца (начиная с 0), номер дня и количество шагов, пройденных
             в этот день. Количество шагов должно быть неотрицательным. Для
             ускорения прототипирования на данном этапе считается, что в месяце
             ровно 30 дней. Если за какой-то день статистика не сохранялась,
             то считаем количество шагов в этот день равным 0.
              */


         }


         // создать метод для вывода шагов за опред месяц + метод для внесения количества шагов за опред месяц

    }
}
