package sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WEB001a
 */
@WebServlet("/WEB001a")
public class WEB001a extends javax.servlet.http.HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WEB001a() {
        super();
        // TODO Auto-generated constructor stub
        // WEB001a 問１
        // ブラウザから入力値を２つ取り、第１入力値の文字列を
        // 第２入力値の回数分繰り返し表示する
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
      pw.println("<title>WEB001a</title>");
      pw.println("</head>");
      pw.println("<body>");
      // JavaプログラムSTART
      // 入力値１：繰り返し表示する文字列
      String input = request.getParameter("param1");
      // 入力値２：繰り返す回数
      String str = request.getParameter("param2");
      // 入力値２を数値に変換
      int n = Integer.MIN_VALUE;
      n = Integer.parseInt(str);
      // 入力値１を入力値２の回数分表示する
      for (int i = 0; i < n; i++) {
        pw.print(input);
        System.out.print(input);
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
