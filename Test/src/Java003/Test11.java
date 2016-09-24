/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author （y-kimura） <br />
 *         （Test11） <br />
 *         （0.1を10回足して10倍する） <br />
 *         更新履歴 2016/9/24 （y-kimura）：（新規作成） <br />
 */
public class Test11 {

  /**
   * （） <br />
   * （） <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    BigDecimal one = new
    		BigDecimal ("0.1");
    BigDecimal ten = new
    		BigDecimal ("10");
    BigDecimal ttl = new
    		BigDecimal ("0");
    int i;

	for ( i = 0; i < 10 ; i++ ) {
		ttl = ttl.add(one);
      }
	System.out.println( ttl );

	BigDecimal result = ttl.multiply(ten);

    System.out.println( result );

  }

}
