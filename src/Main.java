import java.util.Scanner;

public class Main {
    private static int calcArea(int base, int height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base:");
        int base = sc.nextInt();

        System.out.println("Introduce la altura:");
        int height = sc.nextInt();

        int result = calcArea(base, height);

        System.out.printf("El resultado es %d%n", result);
    }
}
