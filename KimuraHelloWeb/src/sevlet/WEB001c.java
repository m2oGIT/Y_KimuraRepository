package sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WEB001c
 */
@WebServlet("/WEB001c")
public class WEB001c extends javax.servlet.http.HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WEB001c() {
        super();
        // TODO Auto-generated constructor stub
        // WEB001c 問３
        // ブラウザから入力値を３つ取り、四則演算を行う
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
      pw.println("<title>WEB001c</title>");
      pw.println("</head>");
      pw.println("<body>");
      // JavaプログラムSTART
      try{
        // 入力値１：左項（整数、負の数、小数点）
        BigDecimal left = new BigDecimal(request.getParameter("number1"));
        // 入力値２：演算子
        String enzan = request.getParameter("number2");
        // 入力値３：右項（整数、負の数、小数点）
        BigDecimal right = new BigDecimal(request.getParameter("number3"));
        // 演算子の入力値によって処理の場合分けを行う
        switch(enzan){
          case "+":
            BigDecimal add = left.add(right);
            pw.print(left);
            pw.printf(" "+enzan+" ");
            pw.print(right);
            pw.printf(" = ");
            pw.print(add);
            break;
          case "-":
            BigDecimal subtract = left.subtract(right);
            pw.print(left);
            pw.printf(" "+enzan+" ");
            pw.print(right);
            pw.printf(" = ");
            pw.print(subtract);
            break;
          case "*":
            BigDecimal multiply = left.multiply(right);
            pw.print(left);
            pw.printf(" "+enzan+" ");
            pw.print(right);
            pw.printf(" = ");
            pw.print(multiply);
            break;
          case "/":
            BigDecimal divide = left.divide(right, 5, BigDecimal.ROUND_HALF_UP);
            pw.print(left);
            pw.printf(" "+enzan+" ");
            pw.print(right);
            pw.printf(" = ");
            pw.printf("%.5f",divide);
            break;
          default:
            pw.println("不正な値が入力されました。");
        } 
      }catch(Exception e){
          pw.println("不正な値が入力されました。");
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
