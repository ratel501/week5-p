import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("나이를 입력하세요 (0 이상의 값): ");
            age = scanner.nextInt();

            if (age < 0) {
                System.out.println("잘못된 입력입니다. 0 이상의 값을 입력하세요.");
            }
        } while (age < 0);

        System.out.println("입력한 나이는: " + age);
    }
}

