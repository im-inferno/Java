public class Generate_email {

    public static void main(String[] args) {
        String name = "Rajveer";
        int age = 29;
        String email = genarateEmail(name, age);
        System.out.println("The generated email is : " + email);
    }

    static String genarateEmail(String name, int age) {
        return (name.toLowerCase() + age + "@email.com");
    }

}
