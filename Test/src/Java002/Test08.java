/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （y-kimura） <br />
 *         （Test08） <br />
 *         （奇数のみ加算） <br />
 *         更新履歴 2016/7/23 （y-kimura）：（新規作成） <br />
 */
public class Test08 {

  /**
   * （奇数のみ加算） <br />
   * （1から100までの奇数のみを加算する） <br />
   * 
   * @param args 奇数のみ加算
   */
  public static void main( String[] args ) {
    // 　2ずつ加算する
    int sum = 0;
    int i;
    for ( i = 1; i <= 100; i += 2 ) {
      sum += i;
    }

    System.out.println( sum );

    //　余りが1になった値のみ加算する
    int sum2 = 0;
    int k;
    int j;
    for ( j = 1; j <= 100; j++ ) {
      k = j % 2;
      if ( k == 1 ) {
        sum2 += j;
      }
    }

    System.out.println( sum2 );
  }

}
