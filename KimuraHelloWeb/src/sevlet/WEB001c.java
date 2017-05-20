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
        // WEB001c ��R
        // �u���E�U������͒l���R���A�l�����Z���s��
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
      request.setCharacterEncoding( "Shift-JIS" );
      response.setContentType( "text/html; charset=Shift-JIS");
      // HTTP���X�|���X�Ƃ��ĕ�������o�͂��郉�C�^�[
      PrintWriter pw = response.getWriter();
      pw.println("<html>");
      pw.println("<head>");
      pw.println("<title>WEB001c</title>");
      pw.println("</head>");
      pw.println("<body>");
      // Java�v���O����START
      try{
        // ���͒l�P�F�����i�����A���̐��A�����_�j
        BigDecimal left = new BigDecimal(request.getParameter("number1"));
        // ���͒l�Q�F���Z�q
        String enzan = request.getParameter("number2");
        // ���͒l�R�F�E���i�����A���̐��A�����_�j
        BigDecimal right = new BigDecimal(request.getParameter("number3"));
        // ���Z�q�̓��͒l�ɂ���ď����̏ꍇ�������s��
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
            pw.println("�s���Ȓl�����͂���܂����B");
        } 
      }catch(Exception e){
          pw.println("�s���Ȓl�����͂���܂����B");
        }
      // Java�v���O����END
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
