package test1;
import java.util.Scanner;

public class rub {
    static final double ROUBLES_PER_DOLLAR = 72.12;

    public static void main(String[] args) {
        int i = 0;
        int n;
        double digit = 0;
        int k;

        Scanner input = new Scanner(System.in);



        System.out.println(instruct());
        k = input.nextInt();

        if (k == 1) {
            System.out.println("Введите количество конвертаций");
            n = input.nextInt();
            int size = n;
            double[] roublesArray = new double[size];



            System.out.println("Введите нужные суммы в долларах через пробел: ");
            int[] dollarsArray = new int[size];
            for (int r = 0; r < size; r++) {
                dollarsArray[r] = input.nextInt();
            }
            double [] j = find_roubles(roublesArray, dollarsArray);


            do {
                for (int r = 0; r < size; r++) {

                    digit = dollarsArray[r] % 10;

                    if (digit >= 5)
                        System.out.println(+dollarsArray[r] + " Американских долларов равны " + j[r]);
                    if (digit == 1)
                        System.out.println(+dollarsArray[r] + " Американский доллар равен " + j[r]);
                    else if (digit >= 2 && digit <= 4)
                        System.out.println(+dollarsArray[r] + " Американских доллара равны " + j[r]);
                    i++;
                }
            } while (i < n);
        }
        if (k == 0)
            System.out.println("Программа завершила свою работу");

    }


    public static double [] find_roubles (double[] roublesArray, int[] dollarsArray){
        for (int r = 0; r < dollarsArray.length; r++) {
            roublesArray[r] = dollarsArray[r] * ROUBLES_PER_DOLLAR;

        }
        return roublesArray;


    }


    public static String instruct () {
        return " Инструкция по использованию программы: введите нужное количество конвертаций. \n" +
                " Конвертируйте нужную сумму. \n  Нажмите 1 - продолжить, либо 0 - отмена";


    }


}






























