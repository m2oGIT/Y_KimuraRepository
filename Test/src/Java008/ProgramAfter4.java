/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import Java007.Member;
import java.util.ArrayList;

/**
 * @author （y-kimura） <br />
 *         （ProgramAfter4） <br />
 *         （社員リスト　多次元配列） <br />
 *         
 *         更新履歴 2017/1/22 （y-kimura）：（新規作成） <br />
 */
public class ProgramAfter4 {
  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main(String[] args) {
  //社員情報
  String [][] list = {
      {"001","一郎","鈴木"},
      {"002","一郎","鈴木"},
      {"003","三郎","鈴木"},
  };
  
  //社員情報リスト
  ArrayList<Member> array = new ArrayList<Member>() ;
  
  //リストに追加
  for (int i=0;i<3;i++){
    array.add(new Member (list[i][0],list[i][1],list[i][2]));
  }
  
  //リストに設定した情報を表示
  for (int n=0;n<3;n++){
    Member shain = array.get(n);
    shain.showInfo();
    }
  }
}
