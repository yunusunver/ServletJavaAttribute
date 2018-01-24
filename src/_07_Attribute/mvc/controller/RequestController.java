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
		
		/*People classýndan 3 tane nesne oluþturduk.  */
		People person1=new People("Yunus","Ünver","Bay");
		People person2=new People("Ertan", "Akpýnaroglu", "Bay");
		People person3=new People("Ali", "Atay", "Bay");
		
		/* People classlarýný teker teker listeye ekledik.  */
		List personPeople=new ArrayList();
		personPeople.add(person1);
		personPeople.add(person2);
		personPeople.add(person3);
		
		/* Listeye attýðýmýz nesneleri attribute'e atýyoruz. */
		request.setAttribute("personPeople", personPeople);
		
		/* Servletten jsp dosyasýna yönlendirme yapýyoruz. */
		RequestDispatcher dispatcher=request.getRequestDispatcher("requestattribute/requestdispatcher.jsp");
		dispatcher.forward(request, response);
		
	}

}
