import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que você deseja verificar");

        Long numberVerify = scanner.nextLong();

        if (numberVerify % 2 == 0 ) {
            System.out.println("O número é PAR");
        } else {
            System.out.println("O número é IMPAR");
        }
    }
}