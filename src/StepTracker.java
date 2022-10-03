import java.util.Scanner;

public class StepTracker {

    MonthData[] monthToData;
    int targetSteps = 10000; // может надо перенести в майн

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

     public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        // Заполните класс самостоятельно
    }
}
