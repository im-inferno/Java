public class Prime {

    public static void main(String args[]) {
        int number = 15;
        if (isPrime(number)) {
            System.out.println("The given number " + number + " is a Prime number");
        } else {
            System.out.println("The given number " + number + " is not a Prime number");
        }
        int number1 = 17;
        if (isPrime(number1)) {
            System.out.println("The given number " + number1 + " is a Prime number");
        } else {
            System.out.println("The given number " + number1 + " is not a Prime number");
        }

    }

    static Boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
