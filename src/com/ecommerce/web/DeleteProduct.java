package com.ecommerce.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ecommerce.entity.EProduct;
import com.ecommerce.util.HibernateUtil;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/delete-product")
public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.sendRedirect("delete-product.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// fetch data from product form submission
		String pid = request.getParameter("id");
		// hibernate operations
		try {
			// 1. load session factory
			SessionFactory sfactory = HibernateUtil.buildSessionFactory();
			
			// 2. create session 
			Session session = sfactory.openSession();
			//3. begin transaction 
			Transaction tx = session.beginTransaction();
			
			// 3. create product 
			EProduct product = new EProduct(Integer.parseInt(pid));
			
			// 4. save product
			session.delete(product);
			
			// 5. commit transaction
			tx.commit();
			
			session.close();
			
			out.print("<p>product is delete succesfully</p>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
