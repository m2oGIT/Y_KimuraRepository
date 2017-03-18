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
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
      request.setCharacterEncoding( "Shift-JIS" );
      response.setContentType( "text/html; charset=Shift-JIS");
      PrintWriter pw = response.getWriter();
      pw.println("<html>");
      pw.println("<head>");
      pw.println("<title>WEB001a</title>");
      pw.println("</head>");
      pw.println("<body>");
      String input = request.getParameter("param1");
      String str = request.getParameter("param2");
      int n = Integer.MIN_VALUE;
      n = Integer.parseInt(str);
      for (int i = 0; i < n; i++) {
        pw.print(input);
        System.out.print(input);
      }
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
