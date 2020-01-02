package ABC083B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n, a, b;
        List<Integer> array = new ArrayList<>();

        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        // 1以上、N以下の整数
        for( int i = 1; i <= n; i++ ){
            // 桁数の合計が、閾値内のものを格納
            if(isThreshold(i, a, b)){
                array.add(i);
            }
        }

        // 合計を出力する
        System.out.println(array.stream().mapToInt(i -> i).sum());
    }

    // 10進法での各桁の和がA以上、B以下の場合、trueを返す
    static private boolean isThreshold(Integer n, Integer a, Integer b){

        // 各桁の合計を算出
        Integer count = Arrays.stream(n.toString().split("")).map(s -> Integer.valueOf(s)).mapToInt(x -> x).sum();


        // A以上、B以下であればtrueを返却する
        if( (count >= a) && (count <= b) ){
            return true;
        } else {
            return false;
        }

    }
}
