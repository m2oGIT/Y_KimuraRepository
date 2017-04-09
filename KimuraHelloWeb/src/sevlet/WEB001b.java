package sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WEB001b
 */
@WebServlet("/WEB001b")
public class WEB001b extends javax.servlet.http.HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WEB001b() {
        super();
        // TODO Auto-generated constructor stub
        // WEB001b 問２
        // ブラウザから入力値を1つ取り、複数人の身長を読み込み、標準体重を表示する
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
      request.setCharacterEncoding( "Shift-JIS" );
      response.setContentType( "text/html; charset=Shift-JIS");
      // HTTPレスポンスとして文字列を出力するライター
      PrintWriter pw = response.getWriter();
      pw.println("<html>");
      pw.println("<head>");
      pw.println("<title>WEB001b</title>");
      pw.println("</head>");
      pw.println("<body>");
      // JavaプログラムSTART
      // 入力値１：身長（カンマ区切り）
      String str = request.getParameter("height");
      // カンマ区切りを処理する
      String comma = ",";
      StringTokenizer height =new StringTokenizer(str,comma);
      // カンマ区切りをリストに格納する
      int list[] = new int[height.countTokens()];
      // データ数の分だけ配列に入れる
      int n = 0;
      while (height.hasMoreTokens()) {
        list[n] = Integer.parseInt(height.nextToken());
        n++;
      }
      // 配列から身長を取り出し、体重を計算して表示する
      double weight =0.00000;
      for (int i = 0; i < list.length; i++) {
        weight = (list[i] - 100) * 0.9;
        // 小数点以下５桁を表示
        pw.printf("%.5f",weight);
        // 改行　←できない！！(2017/4/9)
        pw.println("\r\n");
        // 小数点以下５桁を表示
        System.out.printf("%.5f",weight);
        System.out.println("\r\n");
        // 初期化
        weight =0.00000;
      }
      // JavaプログラムEND
      pw.println("</body>");
      pw.println("</html>");
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
  }

}
