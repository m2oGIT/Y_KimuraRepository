/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author （y-kimura） <br />
 *         （Member） <br />
 *         （社員情報表示、同姓同名チェックのクラス化） <br />
 *         
 *         更新履歴 2017/1/14 （y-kimura）：（新規作成） <br />
 */
public class Member {
  
    // 社員No
    private String id;
    // 名
    private String fstName;
    // 姓
    private String scdName;
    
    public Member(String id, String fstName, String scdName) {
      this.id = id;
      this.fstName = fstName;
      this.scdName = scdName;
    }
    
//  社員情報表示メソッド<br />
    public void showInfo(){
    System.out.println( "社員No :" + this.id );
    System.out.println( "姓     :" + this.scdName );
    System.out.println( "名     :" + this.fstName );
    System.out.println( "姓名   :" + this.scdName + "" + this.fstName );
    System.out.println( "" );
  }
  
//  同姓同名チェックメソッド<br />
    public void checkName( Member mem ){
    if ( this.scdName.equals( mem.scdName )
        && this.fstName.equals( mem.fstName ) ) {
      System.out.println( "社員No=[" + this.id + "]と、社員No=[" + mem.id + "]は同姓同名です" );
    } else {
      System.out.println( "社員No=[" + this.id + "]と、社員No=[" + mem.id + "]は同姓同名ではありません" );
    }
  }
    
//  名前取得メソッド<br />
    public String getFirstName(){
    return this.fstName;
  }
    
//  名前変更メソッド<br />
    public void setFirstName( String nme ){
    this.fstName = nme;
  }
    
}
