import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter your favourite integer");
        Scanner input = new Scanner(System.in);
        Integer value = input.nextInt();
        System.out.println("Your favourite Integer is " + value);
    }
}
