/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �iy-kimura�j <br />
 *         �iTest08�j <br />
 *         �i��̂݉��Z�j <br />
 *         �X�V���� 2016/7/23 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class Test08 {

  /**
   * �i��̂݉��Z�j <br />
   * �i1����100�܂ł̊�݂̂����Z����j <br />
   * 
   * @param args ��̂݉��Z
   */
  public static void main( String[] args ) {
    // �@2�����Z����
    int sum = 0;
    int i;
    for ( i = 1; i <= 100; i += 2 ) {
      sum += i;
    }

    System.out.println( sum );

    //�@�]�肪1�ɂȂ����l�̂݉��Z����
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
