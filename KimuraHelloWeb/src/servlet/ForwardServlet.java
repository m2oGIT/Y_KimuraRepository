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
    // 処理の結果として名前と年齢を取得したとする
    // request.setAttribute("name","山田太郎");
    // request.setAttribute("age",new Integer(20));
    
    // エンティティ作成
    EmployeeEntity entity = new EmployeeEntity();
    entity.setNo( "0001" );
    entity.setName( "山田次郎" );
    entity.setAge( "20" );
    
    // リクエストにエンティティを設定
    request.setAttribute("entity",entity);
    
    // EchoJSP.jspに遷移（WebContentがWebアプリケーションルートとなる）
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
