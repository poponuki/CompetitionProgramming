package ABC088B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * ABC088A - Card Game for Two
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n; // 入力値
        Integer max; // 最大値
        List<Integer> cards = new ArrayList<>(); // カード
        List<Integer> aliceCards = new ArrayList(); // アリスのカード
        List<Integer> bobCards = new ArrayList(); // ボブのカード

        // カード枚数
        n = sc.nextInt();

        // 入力文字をすべて登録する
        for (int i = 0; n > i; i++) {
            cards.add(sc.nextInt());
        }

        for(;;){
            // アリスが最大値のカードを引く
            // 最大値のカードを引く
            max = Collections.max(cards);
            aliceCards.add(max);
            // 引いたカードを除外する
            cards.remove(max);

            // カードがなくなれば終了
            if(cards.size() == 0) break;

            // ボブが最大値のカードを引く
            max = Collections.max(cards);
            bobCards.add(max);
            // 引いたカードを除外する
            cards.remove(max);

            // カードがなくなれば終了
            if(cards.size() == 0) break;
        }

        System.out.println(aliceCards.stream().mapToInt(Integer::intValue).sum() - bobCards.stream().mapToInt(Integer::intValue).sum());
    }
}
