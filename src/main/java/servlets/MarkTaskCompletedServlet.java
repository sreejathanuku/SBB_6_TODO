package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ToDoDAOImpl;
import dao.ToDoDAo;

/**
 * Servlet implementation class MarkTaskCompletedServlet
 */
@WebServlet("/MarkTaskCompletedServlet")
public class MarkTaskCompletedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MarkTaskCompletedServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		ServletContext context = getServletContext();

		int regId = Integer.parseInt(request.getParameter("regId"));
		int taskId = Integer.parseInt(request.getParameter("taskId"));

		ToDoDAo dao = ToDoDAOImpl.getInstance();
		boolean flag = dao.markTaskCompleted(regId, taskId);
		if (flag)
			context.getRequestDispatcher("/ViewTasks.jsp").forward(request, response);
		else
			out.println("TX Failed, Task not marked");
	}

}
