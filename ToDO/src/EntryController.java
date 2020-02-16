

import java.io.IOException;
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
        String rlist;
		rlist = request.getServletPath();
		if(rlist=="R")
		{
		request.setAttribute("listEntries", entryDAO.listEntries());
        RequestDispatcher dispatcher = request.getRequestDispatcher("RemoveEntries.jsp");
        dispatcher.forward(request, response);
		}
		
		else {
			request.setAttribute("listEntries", entryDAO.listEntries());
	        RequestDispatcher dispatcher = request.getRequestDispatcher("ListEntries.jsp");
	        dispatcher.forward(request, response);
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String entry = null;
		entry = request.getParameter("entry");
		if(entry==null)
		{
			request.setAttribute("listEntries", entryDAO.listEntries());
	        RequestDispatcher dispatcher = request.getRequestDispatcher("RemoveEntries.jsp");
	        dispatcher.forward(request, response);
		}
		else {
		entryDAO.addEntry(entry);
	    RequestDispatcher dispatcher = request.getRequestDispatcher("AddEntries.jsp");
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
