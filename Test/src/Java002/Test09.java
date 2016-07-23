/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （y-kimura） <br />
 *         （Test09） <br />
 *         （実行時引数を数値に変換） <br />
 *         更新履歴 2016/7/23 （y-kimura）：（新規作成） <br />
 */
public class Test09 {

  /**
   * （引数分だけ加算） <br />
   * （引数として渡された文字列を数値に変換してループ加算） <br />
   * 
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    int sum;
    int i = Integer.parseInt( args[0] );

    for ( sum = 0; sum < i; sum++ ) {
      sum++;
    }

    System.out.println( sum );

  }

}
