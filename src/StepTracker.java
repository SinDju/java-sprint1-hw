import java.util.Scanner;

public class StepTracker {

    int[][] monthToData;


    public StepTracker() {

        monthToData = new int [12][30];
        for (int i = 0; i < monthToData.length; i++) {
            for (int j = 0; j < monthToData[0].length; j++) {
                monthToData[i][j] = 0;
            }
        }
    }
     int TargetSteps (int targetSteps) {

        if (targetSteps>0) {
            System.out.println("Ваша новая цель по количеству шагов на день: "+ targetSteps);
        }
        else {
            System.out.println("Извините, целевое количества шагов не может быть отрицательным.");
        }
        return targetSteps;
        // метод меняет цель по шагам
    }
    int saveStepsDay(int month, int day, int stepsDay) {
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

        for (int j = 0; j < monthToData[0].length; j++) {

            System.out.println("Месяц: " + month + "." + "День: " + (j + 1) + "." + "Сделано "
                    + monthToData[month][j] + " шагов.");

        }

    }
    int printSumStepsMonth(int month) {
        int sumStepsMonth = 0;
        for (int j = 0; j < monthToData[0].length; j++) {

            sumStepsMonth = sumStepsMonth + monthToData[month][j];
        }
        System.out.println("Общее количество шагов за " + month + " месяц: " + sumStepsMonth);
 return sumStepsMonth;
    }

    void printMaxStepsMonth(int month) {
        int maxSteps=0;
        for (int j = 0; j < monthToData[0].length; j++) {
            if (maxSteps < monthToData[month][j]) {
                maxSteps = monthToData[month][j];
            }
        }
        System.out.println("Максимальное количество шагов за " + month + " месяц: " + maxSteps);
    }

    int printMaxSeriesSteps(int month, int targetSteps) {
        int maxStepsDay=0;
        int StepsDay = 0;
        for (int j = 0; j < monthToData[0].length; j++) {
            if (monthToData[month][j] >= targetSteps)   {
                StepsDay += 1;
            }
            else{
                if (StepsDay > maxStepsDay){
                    maxStepsDay = StepsDay;
                }
                StepsDay = 0;
            }
        }
        if (StepsDay > maxStepsDay){
            maxStepsDay = StepsDay;
        }
        System.out.println("Максимальное подряд идущих дней за " + month + " месяц: " + maxStepsDay);
        return maxStepsDay;
    }

    int printAverageStepsMonth(int month) {

        int averageSteps=monthToData[0].length;
        int sumStepsMonth = 0;
        for (int j = 0; j < monthToData[0].length; j++) {

            sumStepsMonth = sumStepsMonth + monthToData[month][j];
        }
        averageSteps=sumStepsMonth/averageSteps;
  return averageSteps;
    }


    }

