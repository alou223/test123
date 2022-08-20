package test1;
import java.util.Scanner;

public class rub {
    public static void main(String[] args){
        final double ROUBLES_PER_DOLLAR = 72.12;
        int dollars;
        double roubles = 0;
        double digit = 0;

        Scanner input=new Scanner(System.in);

        System.out.println("Введите сумму в долларах: ");
        dollars=input.nextInt();
        roubles=ROUBLES_PER_DOLLAR * dollars;
        digit = dollars%10;

        if(dollars>=5 && dollars<=20)
            System.out.println(+dollars + " Американских долларов равны " +roubles);
        if(digit==1)
            System.out.println(+dollars + " Американский доллар равен " +roubles);
        else if(digit >=2 && digit <=4)
            System.out.println(+dollars + " Американских доллара равны " +roubles);

    }
}