/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author �iy-kimura�j <br />
 *         �iProgramAfter2�j <br />
 *         �i���\�b�h�̃N���X���j <br />
 *         
 *         �X�V���� 2017/1/14 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class ProgramAfter2 {
  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main(String[] args) {
  //��l��
  Member member1 = new Member("00001","��Y","���");
  //��l��
  Member member2 = new Member("00002","��Y","���");
  //�O�l��
  Member member3 = new Member("00003","�O�Y","���");
  
  //�Ј�����\��(��l��)
  member1.showInfo();
  //�Ј�����\��(��l��)
  member2.showInfo();
  //�Ј�����\��(�O�l��)
  member3.showInfo();
  
  //���������`�F�b�N(��l�ڂƓ�l��)
  member1.checkName(member2);
  //���������`�F�b�N(��l�ڂƎO�l��)
  member1.checkName(member3);
  //���������`�F�b�N(��l�ڂƎO�l��)
  member2.checkName(member3);
  }
}
