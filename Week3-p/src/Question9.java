import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();
        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                result = num1 / num2;
                System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
            }
        } else {
            System.out.println("유효하지 않은 연산자입니다.");
        }

    }
}

