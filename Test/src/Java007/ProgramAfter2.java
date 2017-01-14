/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author （y-kimura） <br />
 *         （ProgramAfter2） <br />
 *         （メソッドのクラス化） <br />
 *         
 *         更新履歴 2017/1/14 （y-kimura）：（新規作成） <br />
 */
public class ProgramAfter2 {
  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main(String[] args) {
  //一人目
  Member member1 = new Member("00001","一郎","鈴木");
  //二人目
  Member member2 = new Member("00002","一郎","鈴木");
  //三人目
  Member member3 = new Member("00003","三郎","鈴木");
  
  //社員情報を表示(一人目)
  member1.showInfo();
  //社員情報を表示(二人目)
  member2.showInfo();
  //社員情報を表示(三人目)
  member3.showInfo();
  
  //同姓同名チェック(一人目と二人目)
  member1.checkName(member2);
  //同姓同名チェック(一人目と三人目)
  member1.checkName(member3);
  //同姓同名チェック(二人目と三人目)
  member2.checkName(member3);
  }
}
