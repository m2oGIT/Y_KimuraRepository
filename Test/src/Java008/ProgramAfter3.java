/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import Java007.Member;

/**
 * @author （y-kimura） <br />
 *         （ProgramAfter3） <br />
 *         （getter、setterメソッドの追加） <br />
 *         
 *         更新履歴 2017/1/22 （y-kimura）：（新規作成） <br />
 */
public class ProgramAfter3 {
  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main(String[] args) {
  //一人目
  Member member1 = new Member("00001","一郎","鈴木");
  
  //社員情報を表示
  member1.showInfo();
  
  //名前を表示
  System.out.println( "名前、変更前:"+ member1.getFirstName() );
  
  //名前を変更
  member1.setFirstName("花子");
  
  //名前を表示
  System.out.println( "名前、変更後:"+ member1.getFirstName() );
  System.out.println();
  
  //社員情報を表示
  member1.showInfo();
  
  }
}
