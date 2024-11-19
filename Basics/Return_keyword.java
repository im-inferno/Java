public class Return_keyword {

    public static void main(String[] args) {
        sum(13, 4);
        sub(13, 4);
        sum(29, 43);

    }

    static int sum(int a, int b) {
        int c = a + b;
        System.out.println("Sum : " + c);
        return c;

    }

    static int sub(int a, int b) {
        int c = a - b;
        System.out.println("Substraction  : " + c);
        return c;
    }
}
