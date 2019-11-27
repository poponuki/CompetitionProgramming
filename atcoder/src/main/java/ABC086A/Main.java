package ABC086A;

import java.util.Scanner;

/**
 * ABC086A - Product
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        // 整数(a)の入力
        a = sc.nextInt();
        validate(a);

        // 整数(b)の入力
        b = sc.nextInt();
        validate(b);

        if(isEven(a, b)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    /**
     * 偶数判定
     *
     * 入力値の積が偶数か判定する
     *
     * @param a 整数
     * @param b 整数
     * @return true:偶数 false:奇数
     */
    static private boolean isEven(int a, int b){
        return ((a*b)%2==0);
    }

    /**
     * 入力値バリデーション
     *
     * 入力値が、1=<a,b,=<10000 の場合は、処理を終了する
     *
     * @param input 入力値
     */
    static private void validate(int input){
        int max = 10000;
        int min = 1;

        if( input < min || input > max ){
            System.out.println( min + "以上、" + max + " 未満を入力してください");
            return;
        }
    }

}
