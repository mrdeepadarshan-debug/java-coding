import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            for (int i = 1; i <= n ; i++) {
                    for(int j=1;j<=i-1;j++){
                        System.out.print(" ");
                    }
                for(int j=1;j<=n*2-i*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
