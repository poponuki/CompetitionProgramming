package ABC081A;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * ABC081A - Placing Marbles
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s; // 入力値

        // 文字の入力
        s = sc.next();

        // バリデーション
        // 文字数チェック
        // 3文字以上ならエラー
        if(s.length() != 3){
            System.out.println("0と1を3つ連続して入力してください");
            return;
        }
        // 文字種チェック
        // 0と1以外が含まれていればエラー
        if(!s.matches(".*[0-1]{3}")){
            System.out.println("入力できる数字は、0か1のみです");
            return;
        }

        // 1が含まれている数をカウントする
        String[] sArray = s.split("");
        Long count = Stream.of(sArray)
                .filter(s1 -> s1.matches("1"))
                .count();

        // 結果の表示
        System.out.println(count.toString());
    }
}
