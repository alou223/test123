package test1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rubles {
    int i;
    private int[] dollarsArray;
    private double[] rublesArray;
    static final double ROUBLES_PER_DOLLAR = 72.12;

    public Rubles(int conversionCount, int i1) {
        i = i1;
        try {
            SaveDollars(conversionCount);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void SaveDollars(int conversionCount) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" +separator+"Users" +separator+ "gavru" +separator+ "OneDrive" +separator+ "Рабочий стол" +separator+ "test.txt";
        File file = new File(path);
        Scanner input = new Scanner(file);
        dollarsArray = new int[conversionCount];
        for (int r = 0; r < conversionCount; r++) {
            dollarsArray[r] = input.nextInt();
            rublesArray = new double[conversionCount];
        }
    }

    public int[] getDollarsArray() {
        return dollarsArray;
    }

    public double[] getRublesArray() {
        for (int r = 0; r < dollarsArray.length; r++) {
            rublesArray[r] = dollarsArray[r] * ROUBLES_PER_DOLLAR;
        }
        return rublesArray;
    }
}
class Main{
    public static void main(String[] args) {
            new Client().inputData();

    }

}