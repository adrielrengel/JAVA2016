package br.adriel;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Escopo")
public class Escopo extends HttpServlet {
	
	@Inject
	ContadorApp contApp;

	@Inject
	ContadorRequest contReq;

	@Inject
	ContadorSession contSes;
	
	private static final long serialVersionUID = 1L;
       
   	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.getWriter()

				.append("<html><head></head><body>")

				.append("<table><tbody>")

				.append("<tr><th>" + "Aplicaçao" + "</th><td>" + contApp.getNumero() + "</td></tr>")
				.append("<tr><th>" + "Sessao" + "</th><td>" + contSes.getNumero() + "</td></tr>")
				.append("<tr><th>" + "Requisiçao" + "</th><td>" + contReq.getNumero() + "</td></tr>")

				.append("</tbody></table>")

				.append("</body></html>")

				.flush();
	}

	

}
