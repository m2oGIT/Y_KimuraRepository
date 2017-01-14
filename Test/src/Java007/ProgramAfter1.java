/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author （y-kimura） <br />
 *         （FileReadWriteTest） <br />
 *         （繰り返している処理をメソッド化し、分かりやすく修正） <br />
 *         
 *         更新履歴 2017/1/14 （y-kimura）：（新規作成） <br />
 */
public class ProgramAfter1 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ProgramAfter1() {
    // 行うべき処理なし。
    super();
  }
  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // 社員No
    String id1 = "00001";
    // 名
    String firstName1 = "一郎";
    // 姓
    String secondName1 = "鈴木";

    // 社員No
    String id2 = "00002";
    // 名
    String firstName2 = "一郎";
    // 姓
    String secondName2 = "鈴木";

    // 社員No
    String id3 = "00003";
    // 名
    String firstName3 = "三郎";
    // 姓
    String secondName3 = "鈴木";

  //社員情報を表示(一人目)
    showinfo(id1,firstName1,secondName1);
    //社員情報を表示(二人目)
    showinfo(id2,firstName2,secondName2);
    //社員情報を表示(三人目)
    showinfo(id3,firstName3,secondName3);
    
    
  //同姓同名チェック(一人目と二人目)
    checkName(id1,firstName1,secondName1,id2,firstName2,secondName2);
    //同姓同名チェック(一人目と三人目)
    checkName(id1,firstName1,secondName1,id3,firstName3,secondName3);
    //同姓同名チェック(二人目と三人目)
    checkName(id2,firstName2,secondName2,id3,firstName3,secondName3);
    }
  
//  社員情報表示メソッド<br />
  private static void showinfo(String idcd, String fst, String scd){
    System.out.println( "社員No:" + idcd );
    System.out.println( "姓       :" + scd );
    System.out.println( "名       :" + fst );
    System.out.println( "姓名   :" + scd + "" + fst );
    System.out.println( "" );
  }
  
//  同姓同名チェックメソッド<br />
  private static void checkName(String idcd1, String fst1, String scd1,
                                String idcd2, String fst2, String scd2){
    if ( scd1.equals( scd2 )
        && fst1.equals( fst2 ) ) {
      System.out.println( "社員No=[" + idcd1 + "]と、社員No=[" + idcd2 + "]は同姓同名です" );
    } else {
      System.out.println( "社員No=[" + idcd1 + "]と、社員No=[" + idcd2 + "]は同姓同名ではありません" );
    }
  }
}
