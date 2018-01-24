package _07_Attribute.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import _07_Attribute.mvc.model.People;

@WebServlet("/RequestController")
public class RequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*People class�ndan 3 tane nesne olu�turduk.  */
		People person1=new People("Yunus","�nver","Bay");
		People person2=new People("Ertan", "Akp�naroglu", "Bay");
		People person3=new People("Ali", "Atay", "Bay");
		
		/* People classlar�n� teker teker listeye ekledik.  */
		List personPeople=new ArrayList();
		personPeople.add(person1);
		personPeople.add(person2);
		personPeople.add(person3);
		
		/* Listeye att���m�z nesneleri attribute'e at�yoruz. */
		request.setAttribute("personPeople", personPeople);
		
		/* Servletten jsp dosyas�na y�nlendirme yap�yoruz. */
		RequestDispatcher dispatcher=request.getRequestDispatcher("requestattribute/requestdispatcher.jsp");
		dispatcher.forward(request, response);
		
	}

}
