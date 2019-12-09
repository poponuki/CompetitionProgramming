package ABC087B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer yen500, yen100, yen50, totalFee, count=0;

        yen500 = sc.nextInt();
        yen100 = sc.nextInt();
        yen50 = sc.nextInt();
        totalFee = sc.nextInt();

        for(int i=0; i <= yen500; i++){
            for(int j=0; j <= yen100; j++){
                for(int k=0; k <= yen50; k++){
                    if(isTotalFree(i, j, k, totalFee)) count++;
                }
            }
        }

        System.out.println(count);
    }

    static private boolean isTotalFree(int yen500, int yen100, int yen50, int totalFee){
        return ( totalFee == 500 * yen500 + 100 * yen100 + 50 * yen50 );
    }
}
