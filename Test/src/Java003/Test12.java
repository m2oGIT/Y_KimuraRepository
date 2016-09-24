/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author （y-kimura） <br />
 *         （Test11） <br />
 *         （日時を表示する） <br />
 *         更新履歴 2016/9/24 （y-kimura）：（新規作成） <br />
 */
public class Test12 {

  /**
   * （） <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    Date date = new Date();

    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    System.out.println( "実行日付は" + sdf1.format(date) + "です。" );

  }

}
