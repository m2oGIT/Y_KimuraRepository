/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （y-kimura） <br />
 *         （100まで加算） <br />
 *         （1から100までの数値をループして加算する） <br />
 *         更新履歴 2016/7/23 （y-kimura）：（新規作成） <br />
 */
public class Test07 {

  /**
   * （100までループして加算→表示） <br />
   * （1から100までの数値をループして加算して結果を表示するｘ） <br />
   * 
   * @param args i
   */
  public static void main( String[] args ) {

    int kasan;

    for ( kasan = 0; kasan < 100; kasan++ ) {
      kasan++;
    }

    System.out.println( kasan );
  }
}
