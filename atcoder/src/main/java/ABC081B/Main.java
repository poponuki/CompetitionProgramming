package ABC081B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ABC081B - Shift only
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        int count = 0;

        // 整数(a)の入力
        int a = sc.nextInt();
        validateN(a);

        // 入力文字をすべて登録する
        for(int i = 0; a > i ; i++ ){
            list.add(sc.nextInt());
        }

        // 偶数判定
        if(isEven(list)){
            // 2で割り続けられる回数をカウントする
            while (true){
                // 2で割った値をリストに格納する
                list = list.stream()
                        .map(i -> ( i / 2 ) )
                        .collect(Collectors.toList());
                // 割った回数をカウント
                count++;

                // 奇数判定の場合は、処理を終了する
                if(!isEven(list)){
                    System.out.println(count);
                    return;
                }
            }
        }else {
            System.out.println(count);
            return;
        }
    }

    /**
     * 偶数判定
     *
     * リストに含まれる数字が、すべて偶数か判定する
     *
     * @param list
     * @return
     */
    static private boolean isEven(List<Integer> list){
        Long count = list.stream()
                .filter(i1 -> isEven(i1))
                .count();

        return ( list.size() == count );
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