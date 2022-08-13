/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Class.BookArray;
import Class.Books;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ramir
 */
@WebServlet(urlPatterns = {"/BookTable"})
public class BookTable extends HttpServlet {
Books book;
BookArray registerBook;
Books[] registredBook;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            book = new Books(
                    request.getParameter("code"),
                    request.getParameter("bookName"),
                    request.getParameter("bookTape"),
                    request.getParameter("bookEditorial"),
                    request.getParameter("bookDate")
            );
            
            if(registerBook==null){
                 registerBook=new BookArray();
            }
           
            if(request.getParameter("code") != null) {
            registerBook.saveBooks(book);
            }
            registredBook = registerBook.getBooks();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Books</title>");   
            out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n" +
                        "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
                        "            <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n" +
                        "            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                        "              <span class=\"navbar-toggler-icon\"></span>\n" +
                        "            </button>\n" +
                        "            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n" +
                        "              <ul class=\"navbar-nav\">\n" +
                        "                <li class=\"nav-item active\">\n" +
                        "                  <a class=\"nav-link\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a>\n" +
                        "                </li>\n" +
                        "                <li class=\"nav-item\">\n" +
                        "                  <a class=\"nav-link\" href=\"#\">Features</a>\n" +
                        "                </li>\n" +
                        "                <li class=\"nav-item\">\n" +
                        "                  <a class=\"nav-link\" href=\"#\">Pricing</a>\n" +
                        "                </li>\n" +
                        "                <li class=\"nav-item\">\n" +
                        "                  <a class=\"nav-link disabled\">Disabled</a>\n" +
                        "                </li>\n" +
                        "              </ul>\n" +
                        "            </div>\n" +
                        " </nav>");
            out.println("<br><br><div class=\"container\">");
            out.println("<table class=\"table table-hover table-striped\">");   
            out.println("<thead><tr> <th scope=\"col\">CÓDIGO LIBRO</th> <th scope=\"col\">NOMBRE DEL LIBRO</th>\n" +
                                    "<th scope=\"col\">TIPO DE PASTA</th> <th scope=\"col\">EDITRIAL</th>\n" +
                                    "<th scope=\"col\">AÑO DE PUBLICACIÓN<th> </tr></thead>");
            out.println("<tbody>");
            for(int i = 0; i < registredBook.length; i++){
                if(registredBook[i] != null){
                    out.println("<tr><td>" + registredBook[i].getCode()+ "</td>");
                    out.println("<td>" + registredBook[i].getBookName()+ "</td>");
                    out.println("<td>" + registredBook[i].getBookTape()+ "</td>");
                    out.println("<td>" + registredBook[i].getBookEditorial()+ "</td>");
                    out.println("<td>" + registredBook[i].getBookDate()+ "</td></tr>");
                }
            }
            out.println("</tbody></table>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class='container-lg d-flex'> <a href='index.html' class=\"btn btn-success ml-auto\">Registrar Nuevo Libro</a></div><br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
