/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test08 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * 
   * @param args 奇数のみ加算
   */
  public static void main( String[] args ) {
    int sum = 0;
    int i;
    for ( i = 1; i <= 100; i += 2 ) {
      sum += i;
    }

    System.out.println( sum );
  }

}
