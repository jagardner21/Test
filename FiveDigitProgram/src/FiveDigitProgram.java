import java.util.Scanner;
import java.util.stream.IntStream;

public class FiveDigitProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 5 digit positive integer: ");
        int value = input.nextInt();
        int o = value/1 % 10;
        int t = value/10 % 10;
        int h = value/100 % 10;
        int th = value/1000 % 10;
        int tt = value/10000 % 10;
        int [] a = {o, t, h, th, tt};
        int sum = IntStream.of(a).sum();
        System.out.println(sum);
    }
}
