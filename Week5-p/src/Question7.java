import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("팩토리얼을 계산할 숫자를 입력하세요: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);

        System.out.println(number + "! = " + factorial);
    }

    public static long calculateFactorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}

