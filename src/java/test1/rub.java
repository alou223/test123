package test1;
import java.util.Scanner;

public class rub {
    public static void main(String[] args){
        final double ROUBLES_PER_DOLLAR = 72.12;
        int dollars;
        double roubles;
        Scanner input=new Scanner(System.in);
        System.out.println("Введите сумму в долларах: ");
        dollars=input.nextInt();
        roubles=ROUBLES_PER_DOLLAR * dollars;
        System.out.println("Сумма в рублях равна: " + roubles);
    }
}
