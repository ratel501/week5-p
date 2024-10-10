public class Question8 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 100) {
            sum += number;
            number += 2;
        }

        System.out.println("1부터 100까지의 홀수의 합은: " + sum);
    }
}

