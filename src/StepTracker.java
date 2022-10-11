import java.util.Scanner;

public class StepTracker {

    static int[][] monthToData;
    Scanner scanner;
    Converter converter= new Converter();
    int steps=10000;

    public StepTracker() {
        scanner = new Scanner(System.in);
        monthToData = new int [12][30];
        for (int i = 0; i < monthToData.length; i++) {
            for (int j = 0; j < monthToData[0].length; j++) {
                monthToData[i][j] = 0;
            }
        }
    }
    public int TargetSteps () {
        System.out.println("Введите Вашу новую цель по количеству шагов за день:");
        this.steps = scanner.nextInt();
        if (this.steps >0) {
            System.out.println("Ваша новая цель по количеству шагов на день: "+ this.steps );
        }
        else {
            System.out.println("Извините, целевое количества шагов не может быть отрицательным.");
        }
        return this.steps;
        // метод меняет цель по шагам
    }


    public void addCountStepsPerDay() {

        System.out.println("За какой месяц вы хотите внести количество пройденных шагов: 0-Январь, 1-Февраль, 2-Март, 3-Апрель, " +
                "4-Май, 5-Июнь, 6-Июль, 7-Август, 8-Сентябрь, 9-Октябрь, 10-Ноябрь, 11-Декабрь?");
        int month = scanner.nextInt();
        if (month>=0 & month<12) {
            System.out.println("Введите день месяца: от 1 до 30");
        } else {
            System.out.println("Извините, такой команды пока нет.");
            return;
        }
        int day = scanner.nextInt();
        if (day>=0 & day<31) {
            System.out.println("Введите количество пройденных шагов:");
        } else {
            System.out.println("Извините, такой команды пока нет.");
            return;
        }
        int stepsDay = scanner.nextInt();
        if (stepsDay > 0) {
            monthToData[month][day - 1] = stepsDay;
            System.out.print(day + " день: " + monthToData[month][day - 1]);

        } else {
            System.out.println("Извините, введеное количества шагов не может быть отрицательным.");
            return;
        }

    }

    public void  outputStatisticsStepsMonth() {
        System.out.println("За какой месяц вы хотите узнать количество пройденных шагов: 0-Январь, 1-Февраль, 2-Март, 3-Апрель, " +
                "4-Май, 5-Июнь, 6-Июль, 7-Август, 8-Сентябрь, 9-Октябрь, 10-Ноябрь, 11-Декабрь?");
        int month = scanner.nextInt();
        if (month >= 0 & month < 12) {
            StepTracker.printStepsMonthToDay(month);
            StepTracker.printMaxStepsMonth(month);
            System.out.println("Среднее количество шагов за " + month + " месяц: " + StepTracker.printAverageStepsMonth(month));
            int stepsSum = StepTracker.printSumStepsMonth(month);
           StepTracker.printMaxSeriesSteps(month, steps);
            converter.converterDistance(stepsSum);
            converter.convertercCallory(stepsSum, month);
        } else {
            System.out.println("Извините, такой команды пока нет.");
        }
    }


    public static void printStepsMonthToDay( int month) {

        if (month>=0 & month<12) {
        for (int j = 0; j < monthToData[0].length; j++) {
            if(j<29) {
                System.out.print((j + 1) + " день: " + monthToData[month][j] + ", ");
            } else {
                System.out.print((j + 1) + " день: " + monthToData[month][j]);

            }
            }
        } else{
            System.out.println("Извините, такой команды пока нет.");
        }
    }
    public static int printSumStepsMonth(int month) {
        int sumStepsMonth = 0;
        for (int j = 0; j < monthToData[0].length; j++) {

           sumStepsMonth = sumStepsMonth + monthToData[month][j];
        }
        System.out.println("Общее количество шагов за " + month + " месяц: " + sumStepsMonth);
        return sumStepsMonth;
    }

    public static void printMaxStepsMonth(int month) {
        int maxSteps=0;
        for (int j = 0; j < monthToData[0].length; j++) {
            if (maxSteps < monthToData[month][j]) {
                maxSteps = monthToData[month][j];
            }
        }
        System.out.println(" ");
        System.out.println("Максимальное количество шагов за " + month + " месяц: " + maxSteps);
    }

    public static int printMaxSeriesSteps(int month, int targetSteps) {
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

    public static int printAverageStepsMonth(int month) {

        int averageSteps=monthToData[0].length;
        int sumStepsMonth = 0;
        for (int j = 0; j < monthToData[0].length; j++) {

            sumStepsMonth = sumStepsMonth + monthToData[month][j];
        }
        averageSteps=sumStepsMonth/averageSteps;
        return averageSteps;
    }

}

