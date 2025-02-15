package com.bakeryservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weekfiveproject.Bakery;
import com.weekfiveproject.DAO;

/**
 * Servlet implementation class deleteDB
 */
@WebServlet("/deleteFromDB")
public class deleteFromDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteFromDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        Bakery deleteFromDB = new Bakery();
        
        deleteFromDB.setBakeryID(request.getParameter("bakery_id"));
        
        DAO.deleteFromDB(Integer.parseInt(deleteFromDB.getBakeryID()));
        request.getRequestDispatcher("readDB.jsp").forward(request, response); 
        
    }//dopost

}
