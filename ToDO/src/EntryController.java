

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EntryController
 */
@WebServlet("/EntryController")
public class EntryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EntryDAO entryDAO;
    /**
     * Default constructor. 
     */
	public void init()
	{
		 entryDAO = new EntryDAO();
	}
	
    public EntryController() {
    	
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher;
		request.setAttribute("listEntries", entryDAO.entries);
        dispatcher = request.getRequestDispatcher("ListEntries.jsp");
        dispatcher.forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher;
		String choice = null;
		String[] entries = null;
		choice = request.getParameter("choice");
		List<Integer> del = new ArrayList<>();
		if(choice!=null)
		{
			switch(choice) {
			case "remove":
				request.setAttribute("listEntries", entryDAO.entries);
		        dispatcher = request.getRequestDispatcher("RemoveEntries.jsp");
		        dispatcher.forward(request, response);
		        break;
			case "add":
		        dispatcher = request.getRequestDispatcher("AddEntries.jsp");
		        dispatcher.forward(request, response);
				break;
		     default:
		        entryDAO.addEntry(choice);
		        response.sendRedirect("AddEntries.jsp");
			}
		}			
		else {
			entries = request.getParameterValues("entries");
			if(entries != null) {
		for(String e: entries) {
			del.add(Integer.parseInt(e));
		}
		entryDAO.deleteEntry(del);
		request.setAttribute("listEntries", entryDAO.entries);
	     dispatcher = request.getRequestDispatcher("ListEntries.jsp");
	    dispatcher.forward(request, response);
		}
			else {
				request.setAttribute("listEntries", entryDAO.entries);
			     dispatcher = request.getRequestDispatcher("ListEntries.jsp");
			    dispatcher.forward(request, response);
			}
		}		
	}			    
}
