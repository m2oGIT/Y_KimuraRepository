/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �iy-kimura�j <br />
 *         �i100�܂ŉ��Z�j <br />
 *         �i1����100�܂ł̐��l�����[�v���ĉ��Z����j <br />
 *         �X�V���� 2016/7/23 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class Test07 {

  /**
   * �i100�܂Ń��[�v���ĉ��Z���\���j <br />
   * �i1����100�܂ł̐��l�����[�v���ĉ��Z���Č��ʂ�\�����邘�j <br />
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
