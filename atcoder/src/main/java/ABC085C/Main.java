package ABC085C;

import java.util.Scanner;

/**
 * ABC085C - Otoshidama
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n, y;

        n = sc.nextInt();
        y = sc.nextInt();

        for(int yen10 = 0; n >= yen10; yen10++){
            for(int yen5 =0; n >= yen5 ; yen5++ ){
                if((yen10 + yen5) > n) break; // 計算量削減のため、nを超えていれば終了する
                int yen1 = n - yen10 - yen5; // 円の枚数をカウントする
                if( (10000*yen10 + 5000*yen5 + 1000*yen1) == y ){
                    System.out.println(yen10 + " " + yen5 + " " + yen1);
                    return;
                }

                // forを三重にループした場合は、b05、b08でテストケースNGとなる
//                for(int yen1=0; n > yen1; yen1++){
//                    if( ( yen1 + yen5 + yen10) > n ) break; // 計算量削減のため、nを超えていれば終了する
//                    // お札の枚数が一致する場合は、合計値を比較する
//                    if( ( yen1 + yen5 + yen10) == n ){
//                        // 金額が一致する場合は、結果を出力し、終了する
//                        if( (10000*yen10 + 5000*yen5 + 1000*yen1) == y ){
//                            System.out.println(yen10 + " " + yen5 + " " + yen1);
//                            return;
//                        }
//                    }
//                }
            }
        }

        // 一致する条件がない場合は、結果を出力し、処理を終了する
        System.out.println("-1 -1 -1");
    }
}
