package Assignment;

public class DisariumNumber {
    
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    
    public static boolean isDisarium(int num) {
        int temp = num;
        int digitCount = countDigits(num);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, digitCount);
            temp /= 10;
            digitCount--;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int number = 89;

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
    }
}
