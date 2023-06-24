package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrosTutores extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Criando dados de Tutor: CREATE</h1><p>from <strong>C</strong>RUD</p>");
	}
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Recebendo dados de Tutor: READ</h1><p>from C<strong>R</strong>UD</p>");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Alterando dados de Tutor: UPDATE</h1><p>from CR<strong>U</strong>D</p>");
	} 

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Apagando dados de Tutor: DELETE</h1><p>from CRU<strong>D</strong></p>");
	}
}

