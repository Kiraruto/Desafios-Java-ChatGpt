import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que você deseja verificar");

        BigInteger numberVerify = scanner.nextBigInteger();
        BigInteger numberFor = BigInteger.ONE;

        for (BigInteger i = numberVerify; i.compareTo(BigInteger.ONE) > 0; i = i.subtract(BigInteger.ONE)) {
            numberFor = numberFor.multiply(i);
            System.out.println(numberFor);
        }


    }
}