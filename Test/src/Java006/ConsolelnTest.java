/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author �iy-kimura�j <br />
 *         �iConsolelnTest�j <br />
 *         �i�R���\�[��������͂��ꂽ�����s�̕�����𗭂ߍ��݁A
 *         �@�\�ߒ�`���ꂽ�I������(end)�����͂��ꂽ�ꍇ�ɁA
 *         �@�ꊇ�ŏo�͂��鏈�����쐬����B�j <br />
 *         �X�V���� 2017/1/9 �F�i�V�K�쐬�j <br />
 */
public class ConsolelnTest {
  
  public static void main(String[] args) {
    
    ArrayList<String> list = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    String endmark = new String("end");
    int i = 0;
    int x = 0;
    
    System.out.println("���������͂��Ă��������B");
    System.out.println(endmark + "�̓��͂ŏI�����܂��B");
    
    list.add(scanner.nextLine());

    do {
      String youso = list.get(x);
      
      if(endmark.equals(youso)) {
        i++;
      } else {
        list.add(scanner.nextLine());
        i = 0;
      }
      x++;
    } while (i < 1);

    System.out.print("���߂���������o�͂��܂��B");

    for (int n = 0 ; n < list.size()-1 ; n++) {
      String input = list.get(n);
      System.out.print(input);
    }

  }

}
