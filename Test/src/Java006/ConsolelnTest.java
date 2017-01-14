/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author （y-kimura） <br />
 *         （ConsolelnTest） <br />
 *         （コンソールから入力された複数行の文字列を溜め込み、
 *         　予め定義された終了文字(end)が入力された場合に、
 *         　一括で出力する処理を作成する。） <br />
 *         更新履歴 2017/1/9 ：（新規作成） <br />
 */
public class ConsolelnTest {
  
  public static void main(String[] args) {
    
    ArrayList<String> list = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    String endmark = new String("end");
    int i = 0;
    int x = 0;
    
    System.out.println("文字列を入力してください。");
    System.out.println(endmark + "の入力で終了します。");
    
    list.add(scanner.nextLine());

    do {
      String youso = list.get(x);
      
      if(endmark.equals(youso)) {
        i++;
      } else {
        list.add(scanner.nextLine());
        i = 0;
      }
      x++;
    } while (i < 1);

    System.out.print("貯めた文字列を出力します。");

    for (int n = 0 ; n < list.size()-1 ; n++) {
      String input = list.get(n);
      System.out.print(input);
    }

  }

}
