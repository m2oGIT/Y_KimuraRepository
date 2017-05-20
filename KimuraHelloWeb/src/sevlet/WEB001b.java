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
        // WEB001b ��Q
        // �u���E�U������͒l��1���A�����l�̐g����ǂݍ��݁A�W���̏d��\������
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
      pw.println("<title>WEB001b</title>");
      pw.println("</head>");
      pw.println("<body>");
      // Java�v���O����START
      // ���͒l�P�F�g���i�J���}��؂�j
      String str = request.getParameter("height");
      // �J���}��؂����������
      String comma = ",";
      StringTokenizer height =new StringTokenizer(str,comma);
      // �J���}��؂�����X�g�Ɋi�[����
      int list[] = new int[height.countTokens()];
      // �f�[�^���̕������z��ɓ����
      int n = 0;
      while (height.hasMoreTokens()) {
        list[n] = Integer.parseInt(height.nextToken());
        n++;
      }
      // �z�񂩂�g�������o���A�̏d���v�Z���ĕ\������
      double weight =0.00000;
      for (int i = 0; i < list.length; i++) {
        weight = (list[i] - 100) * 0.9;
        // �����_�ȉ��T����\��
        pw.printf("%.5f",weight);
        pw.println("<br/>");
        // �����_�ȉ��T����\��
        System.out.printf("%.5f",weight);
        System.out.println("\n");
        // ������
        weight =0.00000;
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
