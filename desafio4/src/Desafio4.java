import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<number; i++){
            String str = sc.nextLine();
            System.out.print(new StringBuilder(str.substring(0, str.length()/2)).reverse());
            System.out.println(new StringBuilder(str.substring(str.length()/2)).reverse());
        }
    }
}