/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author �iy-kimura�j <br />
 *         �iTest11�j <br />
 *         �i������\������j <br />
 *         �X�V���� 2016/9/24 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class Test12 {

  /**
   * �i�j <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {
    Date date = new Date();

    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    System.out.println( "���s���t��" + sdf1.format(date) + "�ł��B" );

  }

}
