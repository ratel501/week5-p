import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("숫자를 입력하세요 (n >= 100 일 때 합을 출력합니다): ");

        while (true) {
            n = scanner.nextInt();
            sum += n;

            if (n >= 100) {
                break;
            }
        }

        System.out.println("1부터 " + n + "까지의 합은: " + sum);
    }
}

