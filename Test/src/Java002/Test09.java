/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �iy-kimura�j <br />
 *         �iTest09�j <br />
 *         �i���s�������𐔒l�ɕϊ��j <br />
 *         �X�V���� 2016/7/23 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class Test09 {

  /**
   * �i�������������Z�j <br />
   * �i�����Ƃ��ēn���ꂽ������𐔒l�ɕϊ����ă��[�v���Z�j <br />
   * 
   * @param args ���s������
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
