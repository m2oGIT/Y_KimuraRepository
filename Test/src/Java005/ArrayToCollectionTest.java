/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java005;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author �iy-kimura�j <br />
 *         �iArryList�j <br />
 *         �i�j <br />
 *         �X�V���� 2017/1/9 �iy-kimura�j�F�i�V�K�쐬�j <br />
 */
public class ArrayToCollectionTest {

  /**
   * �i�j <br />
   *
   * @param args
   *            ���s������
   */
  public static void main(String[] args) {

    System.out.println("������5�����");

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();

    try {
      System.out.println("1���");
      list.add(scanner.nextLine());
      Integer.parseInt(list.get(list.size() -1));

      System.out.println("2���");
      list.add(scanner.nextLine());
      Integer.parseInt(list.get(list.size() -1));

      System.out.println("3���");
      list.add(scanner.nextLine());
      Integer.parseInt(list.get(list.size() -1));

      System.out.println("4���");
      list.add(scanner.nextLine());
      Integer.parseInt(list.get(list.size() -1));

      System.out.println("5���");
      list.add(scanner.nextLine());
      Integer.parseInt(list.get(list.size() -1));

    } catch (NumberFormatException e) {
      System.out.println("�����ł͂���܂���B�������I�����܂��B");
      System.exit(0);
    }

    int o = Integer.MIN_VALUE;
    int n = Integer.MIN_VALUE;
    int sum = 0;
    double ave = 0.0;

    for (String str : list) {
      n = Integer.parseInt(str);
      if (n < o) {
        n = o;
      }
      sum = sum + n;
      ave = (double)sum / list.size();
    }

    System.out.println("�ő�l��" + n + "�ł��B");
    System.out.println("���v�l��" + sum + "�ł��B");
    System.out.println("���ϒl��" + ave + "�ł��B");

  }

}
