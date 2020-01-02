package ABC085B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * ABC085B - Kagami Mochi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n; // 入力値
        List<Integer> mochis = new ArrayList<>(); // 鏡餅

        // 餅の枚数
        n = sc.nextInt();

        // 入力文字をすべて登録する
        for (int i = 0; n > i; i++) {
            mochis.add(sc.nextInt());
        }
        // 長さが重複された餅を除外する
        System.out.println(mochis.stream().distinct().collect(Collectors.toList()).size());
    }
}