

import java.io.IOException;
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

	
			request.setAttribute("listEntries", entryDAO.listEntries());
	        RequestDispatcher dispatcher = request.getRequestDispatcher("ListEntries.jsp");
	        dispatcher.forward(request, response);
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String entry = null;
		String[] values = null;
		values = request.getParameterValues("entries");
		entry = request.getParameter("entry");
		
		if(entry!=null)
		{
			entryDAO.addEntry(entry);
		    RequestDispatcher dispatcher = request.getRequestDispatcher("AddEntries.jsp");
		    dispatcher.forward(request, response);
		}
		else if(values != null) {
		for(String e: values) {
			entryDAO.deleteEntry(Integer.parseInt(e));
		}
		request.setAttribute("listEntries", entryDAO.listEntries());
	    RequestDispatcher dispatcher = request.getRequestDispatcher("ListEntries.jsp");
	    dispatcher.forward(request, response);
		
		}
		
		else {
			request.setAttribute("listEntries", entryDAO.listEntries());
	        RequestDispatcher dispatcher = request.getRequestDispatcher("RemoveEntries.jsp");
	        dispatcher.forward(request, response);
		}
	}
	
	/*private void listEntries(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntryDAO entryDAO = new EntryDAO();
		List<Entries> entries = entryDAO.listEntries();
        request.setAttribute("listEntries", entries);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ListEntries.jsp");
        dispatcher.forward(request, response);
	}*/
		    

}
