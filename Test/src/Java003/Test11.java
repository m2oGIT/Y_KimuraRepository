/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author �iy-kimura�j <br />
 *         �iTest11�j <br />
 *         �i0.1��10�񑫂���10�{����j <br />
 *         �X�V���� 2016/9/24 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class Test11 {

  /**
   * �i�j <br />
   * �i�j <br />
   *
   * @param args ���s������
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