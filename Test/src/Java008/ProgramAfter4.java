/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import Java007.Member;
import java.util.ArrayList;

/**
 * @author �iy-kimura�j <br />
 *         �iProgramAfter4�j <br />
 *         �i�Ј����X�g�@�������z��j <br />
 *         
 *         �X�V���� 2017/1/22 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class ProgramAfter4 {
  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main(String[] args) {
  //�Ј����
  String [][] list = {
      {"001","��Y","���"},
      {"002","��Y","���"},
      {"003","�O�Y","���"},
  };
  
  //�Ј���񃊃X�g
  ArrayList<Member> array = new ArrayList<Member>() ;
  
  //���X�g�ɒǉ�
  for (int i=0;i<3;i++){
    array.add(new Member (list[i][0],list[i][1],list[i][2]));
  }
  
  //���X�g�ɐݒ肵������\��
  for (int n=0;n<3;n++){
    Member shain = array.get(n);
    shain.showInfo();
    }
  }
}
