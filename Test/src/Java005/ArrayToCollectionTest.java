/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java005;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author （y-kimura） <br />
 *         （ArryList） <br />
 *         （） <br />
 *         更新履歴 2017/1/9 （y-kimura）：（新規作成） <br />
 */
public class ArrayToCollectionTest {

  /**
   * （） <br />
   *
   * @param args
   *            実行時引数
   */
  public static void main(String[] args) {

    System.out.println("整数を5回入力");

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();

    try {
      System.out.println("1回目");
      list.add(scanner.nextLine());
      Integer.parseInt(list.get(list.size() -1));

      System.out.println("2回目");
      list.add(scanner.nextLine());
      Integer.parseInt(list.get(list.size() -1));

      System.out.println("3回目");
      list.add(scanner.nextLine());
      Integer.parseInt(list.get(list.size() -1));

      System.out.println("4回目");
      list.add(scanner.nextLine());
      Integer.parseInt(list.get(list.size() -1));

      System.out.println("5回目");
      list.add(scanner.nextLine());
      Integer.parseInt(list.get(list.size() -1));

    } catch (NumberFormatException e) {
      System.out.println("整数ではありません。処理を終了します。");
      System.exit(0);
    }

    int o = Integer.MIN_VALUE;
    int n = Integer.MIN_VALUE;
    int sum = 0;
    double ave = 0.0;

    for (String str : list) {
      n = Integer.parseInt(str);
      if (n < o) {
        n = o;
      }
      sum = sum + n;
      ave = (double)sum / list.size();
    }

    System.out.println("最大値は" + n + "です。");
    System.out.println("合計値は" + sum + "です。");
    System.out.println("平均値は" + ave + "です。");

  }

}
