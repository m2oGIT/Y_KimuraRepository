/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import Java007.Member;

/**
 * @author �iy-kimura�j <br />
 *         �iProgramAfter3�j <br />
 *         �igetter�Asetter���\�b�h�̒ǉ��j <br />
 *         
 *         �X�V���� 2017/1/22 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class ProgramAfter3 {
  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main(String[] args) {
  //��l��
  Member member1 = new Member("00001","��Y","���");
  
  //�Ј�����\��
  member1.showInfo();
  
  //���O��\��
  System.out.println( "���O�A�ύX�O:"+ member1.getFirstName() );
  
  //���O��ύX
  member1.setFirstName("�Ԏq");
  
  //���O��\��
  System.out.println( "���O�A�ύX��:"+ member1.getFirstName() );
  System.out.println();
  
  //�Ј�����\��
  member1.showInfo();
  
  }
}
