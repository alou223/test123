package test1;

import java.util.Arrays;
import java.util.Scanner;

class Client {
    Scanner input = new Scanner(System.in);
    Client(){inputData();
    }
    public void inputData(){
        int i = 0;
        System.out.println("Инструкция по использованию программы: введите нужное количество конвертаций. Конвертируйте нужную сумму.");
        System.out.println("Введите количество конвертаций:");
        int conversionCount = input.nextInt();
        Rubles rubles = new Rubles(conversionCount,i);
        System.out.println("Суммы в долларах:" + Arrays.toString(rubles.getDollarsArray()));
        do {
            for (int r = 0; r < conversionCount; r++) {

                int digit = rubles.getDollarsArray()[r] % 10;

                if (digit >= 5)
                    System.out.println(rubles.getDollarsArray()[r] + " Американских долларов равны " + rubles.getRublesArray()[r]);
                if (digit == 1)
                    System.out.println(rubles.getDollarsArray()[r] + " Американский доллар равен " + rubles.getRublesArray()[r]);
                else if (digit >= 2 && digit <= 4)
                    System.out.println(rubles.getDollarsArray()[r] + " Американских доллара равны " + rubles.getRublesArray()[r]);
                i++;
            }
        } while (i < conversionCount);
    }


}
