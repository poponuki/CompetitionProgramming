package practicea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        String s;

        // 整数の入力
        a = sc.nextInt();
        if( a < 1 || a > 1000 ){
            System.out.println("1以上、100未満を入力してください");
            return;
        }

        // 整数の入力
        b = sc.nextInt();
        if( b < 1 || b > 1000 ){
            System.out.println("1以上、100未満を入力してください");
            return;
        }

        // 整数の入力
        c = sc.nextInt();
        if( c < 1 || c > 1000 ){
            System.out.println("1以上、100未満を入力してください");
            return;
        }

        // 文字の入力
        s = sc.next();
        // 出力
        System.out.println((a+b+c) + " " + s);
    }
}