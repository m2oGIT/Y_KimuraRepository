/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author �iy-kimura�j <br />
 *         �iFileReadWriteTest�j <br />
 *         �i�J��Ԃ��Ă��鏈�������\�b�h�����A������₷���C���j <br />
 *         
 *         �X�V���� 2017/1/14 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class ProgramAfter1 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ProgramAfter1() {
    // �s���ׂ������Ȃ��B
    super();
  }
  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // �Ј�No
    String id1 = "00001";
    // ��
    String firstName1 = "��Y";
    // ��
    String secondName1 = "���";

    // �Ј�No
    String id2 = "00002";
    // ��
    String firstName2 = "��Y";
    // ��
    String secondName2 = "���";

    // �Ј�No
    String id3 = "00003";
    // ��
    String firstName3 = "�O�Y";
    // ��
    String secondName3 = "���";

  //�Ј�����\��(��l��)
    showinfo(id1,firstName1,secondName1);
    //�Ј�����\��(��l��)
    showinfo(id2,firstName2,secondName2);
    //�Ј�����\��(�O�l��)
    showinfo(id3,firstName3,secondName3);
    
    
  //���������`�F�b�N(��l�ڂƓ�l��)
    checkName(id1,firstName1,secondName1,id2,firstName2,secondName2);
    //���������`�F�b�N(��l�ڂƎO�l��)
    checkName(id1,firstName1,secondName1,id3,firstName3,secondName3);
    //���������`�F�b�N(��l�ڂƎO�l��)
    checkName(id2,firstName2,secondName2,id3,firstName3,secondName3);
    }
  
//  �Ј����\�����\�b�h<br />
  private static void showinfo(String idcd, String fst, String scd){
    System.out.println( "�Ј�No:" + idcd );
    System.out.println( "��       :" + scd );
    System.out.println( "��       :" + fst );
    System.out.println( "����   :" + scd + "" + fst );
    System.out.println( "" );
  }
  
//  ���������`�F�b�N���\�b�h<br />
  private static void checkName(String idcd1, String fst1, String scd1,
                                String idcd2, String fst2, String scd2){
    if ( scd1.equals( scd2 )
        && fst1.equals( fst2 ) ) {
      System.out.println( "�Ј�No=[" + idcd1 + "]�ƁA�Ј�No=[" + idcd2 + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + idcd1 + "]�ƁA�Ј�No=[" + idcd2 + "]�͓��������ł͂���܂���" );
    }
  }
}
