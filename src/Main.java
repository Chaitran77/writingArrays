public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int computeOddSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { continue; }
            sum += numbers[i];
        }
        return sum;
    }

    public static void replaceEvens(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) { continue; }
            numbers[i] = -numbers[i];
        }
    }
}