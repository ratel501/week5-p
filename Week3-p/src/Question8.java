import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("키(cm)를 입력하세요: ");
        double heightCm = scanner.nextDouble();
        System.out.print("몸무게(kg)를 입력하세요: ");
        double weightKg = scanner.nextDouble();

        double heightM = heightCm / 100;

        double bmi = weightKg / (heightM * heightM);

        System.out.printf("당신의 BMI는 %.2f입니다.\n", bmi);

        if (bmi < 18.5) {
            System.out.println("저체중입니다.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("정상입니다.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("과체중입니다.");
        } else {
            System.out.println("비만입니다.");
        }

    }
}

