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
 * @author �iy-kimura�j <br />
 *         �iFileReadWriteTest�j <br />
 *         �i/run/file/text.txt�Ƃ����t�@�C���ɑ΂��A
 *         �@���s���ɗ^����������ƁA���s���̓�����
 *         �@�ǉ��������݂ŏ������ޏ������쐬����B�j <br />
 *         
 *         �X�V���� 2017/1/9 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class FileReadWriteTest {
  
  public static void main(String[] args) {
    
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    try{
      File wfile = new File("C:\\eclipse\\workspace\\git\\Y_KimuraRepository\\Test\\run\\file\\test.txt");
      FileWriter textwrite = new FileWriter(wfile, true);
      
      textwrite.write( sdf.format(date) );
      textwrite.write( "�N����������������" );
      
      textwrite.close();
    }catch(IOException e){
      System.out.println( e );
    }
    
    System.out.println("�t�@�C���̓��e��\�����܂��B");
    
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
