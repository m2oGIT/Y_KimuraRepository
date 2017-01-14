/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author （y-kimura） <br />
 *         （FileReadWriteTest） <br />
 *         （/run/file/text.txtというファイルに対し、
 *         　実行時に与えた文字列と、実行時の日時を
 *         　追加書き込みで書き込む処理を作成する。） <br />
 *         
 *         更新履歴 2017/1/9 （y-kimura）：（新規作成） <br />
 */
public class FileReadWriteTest {
  
  public static void main(String[] args) {
    
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    try{
      File wfile = new File("C:\\eclipse\\workspace\\git\\Y_KimuraRepository\\Test\\run\\file\\test.txt");
      FileWriter textwrite = new FileWriter(wfile, true);
      
      textwrite.write( sdf.format(date) );
      textwrite.write( "起動引数を書き込み" );
      
      textwrite.close();
    }catch(IOException e){
      System.out.println( e );
    }
    
    System.out.println("ファイルの内容を表示します。");
    
    try{
      File rfile = new File("C:\\eclipse\\workspace\\git\\Y_KimuraRepository\\Test\\run\\file\\test.txt");
      FileReader textread = new FileReader(rfile);
      
      int ch;
      while ((ch = textread.read()) != -1){
        System.out.print( (char)ch );
      }
      
      textread.close();
    }catch(FileNotFoundException e){
      System.out.println( e );
    }catch(IOException e){
      System.out.println( e );
    }

  }

}
