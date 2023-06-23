package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrosPets extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Criando dados de Pet: CREATE</h1><p>from <strong>C</strong>RUD</p>");
	}
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Recebendo dados de Pet: READ</h1><p>from C<strong>R</strong>UD</p>");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Alterando dados de Pet: UPDATE</h1><p>from CR<strong>U</strong>D</p>");
	} 

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Apagando dados de Pet: DELETE</h1><p>from CRU<strong>D</strong></p>");
	}
}

//Desenvolver lógica de CRUD para os endpoints de Tutores e Pets.
//
//Para cada endpoint:
//
//POST - Receber os dados como parâmetro e retornar a entidade cadastrada.
//
//GET - Buscar todos os registros cadastrados da entidade.
//
//PUT - Receber os dados necessários para edição como parâmetro e retornar a entidade alterada.
//
//DELETE - Receber os dados necessários para identificação e remoção da entidade correspondente e retornar um boolean indicando o sucesso.
//
//Obs.: Pode salvar os registros em listas, não precisa conectar num banco de dados.
