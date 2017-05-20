package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.EmployeeEntity;

/**
 * Servlet implementation class ForwardServlet
 */
@WebServlet("/ForwardServlet")
public class ForwardServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    // �����̌��ʂƂ��Ė��O�ƔN����擾�����Ƃ���
    // request.setAttribute("name","�R�c���Y");
    // request.setAttribute("age",new Integer(20));
    
    // �G���e�B�e�B�쐬
    EmployeeEntity entity = new EmployeeEntity();
    entity.setNo( "0001" );
    entity.setName( "�R�c���Y" );
    entity.setAge( "20" );
    
    // ���N�G�X�g�ɃG���e�B�e�B��ݒ�
    request.setAttribute("entity",entity);
    
    // EchoJSP.jsp�ɑJ�ځiWebContent��Web�A�v���P�[�V�������[�g�ƂȂ�j
    RequestDispatcher rd = request.getRequestDispatcher( "/EchoJSP.jsp" );
    rd.forward( request, response );
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    this.doGet( request, response );
  }

}
