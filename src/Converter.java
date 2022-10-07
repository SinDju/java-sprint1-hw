public class Converter {
    int stepLength=75;
    int calloryStep=50;

    void converterDistance(int stepsSum) {
        stepsSum=(stepsSum*stepLength)/100000;
        System.out.println("Пройденная дистанция (в км): " + stepsSum);
    }
    void convertercCallory(int stepsSum, int month) {
       int callorySum = (stepsSum*calloryStep)/1000;
        System.out.println("За " + month + " месяц сожжено " +  callorySum + " килоколорий.");
    }

}
