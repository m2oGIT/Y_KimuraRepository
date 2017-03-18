/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author �iy-kimura�j <br />
 *         �iMember�j <br />
 *         �i�Ј����\���A���������`�F�b�N�̃N���X���j <br />
 *         
 *         �X�V���� 2017/1/14 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class Member {
  
    // �Ј�No
    private String id;
    // ��
    private String fstName;
    // ��
    private String scdName;
    
    public Member(String id, String fstName, String scdName) {
      this.id = id;
      this.fstName = fstName;
      this.scdName = scdName;
    }
    
//  �Ј����\�����\�b�h<br />
    public void showInfo(){
    System.out.println( "�Ј�No :" + this.id );
    System.out.println( "��     :" + this.scdName );
    System.out.println( "��     :" + this.fstName );
    System.out.println( "����   :" + this.scdName + "" + this.fstName );
    System.out.println( "" );
  }
  
//  ���������`�F�b�N���\�b�h<br />
    public void checkName( Member mem ){
    if ( this.scdName.equals( mem.scdName )
        && this.fstName.equals( mem.fstName ) ) {
      System.out.println( "�Ј�No=[" + this.id + "]�ƁA�Ј�No=[" + mem.id + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + this.id + "]�ƁA�Ј�No=[" + mem.id + "]�͓��������ł͂���܂���" );
    }
  }
    
//  ���O�擾���\�b�h<br />
    public String getFirstName(){
    return this.fstName;
  }
    
//  ���O�ύX���\�b�h<br />
    public void setFirstName( String nme ){
    this.fstName = nme;
  }
    
}
