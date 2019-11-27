package ABC081B;

import java.util.Scanner;
import java.util.stream.Stream;


/**
 * ABC081B - Shift only
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 整数(a)の入力
        int a = sc.nextInt();
        validateN(a);

        // 文字の入力
        String s = sc.next();
        String[] array = s.split(" ");

        // 入力文字数の一致
        if( array.length != a ){
            System.out.println("入力文字数が一致していません");
            return;
        }

        Long count = Stream.of(array)
                .filter(s1 -> isEven(Integer.valueOf(s1)))
                .count();

    }

    /**
     * 偶数判定
     *
     * 入力値の積が偶数か判定する
     *
     * @param a 整数
     * @return true:偶数 false:奇数
     */
    static private boolean isEven(int a){
        return (a%2==0);
    }

    /**
     * 入力値バリデーション
     *
     * 入力値が、1=<a,b,=<200 の場合は、処理を終了する
     *
     * @param input 入力値
     */
    static private void validateN(int input){
        int max = 200;
        int min = 1;

        if( input < min || input > max ){
            System.out.println( min + "以上、" + max + " 未満を入力してください");
            return;
        }
    }

    /**
     * 入力値バリデーション
     *
     * 入力値が、1=<a,b,=<1000000000 の場合は、処理を終了する
     *
     * @param input
     */
    static private void validateA(int input){
        int max = 1000000000;
        int min = 1;

        if( input < min || input > max ){
            System.out.println( min + "以上、" + max + " 未満を入力してください");
            return;
        }
    }

}