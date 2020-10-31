package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Model.Leitura;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amaral
 */
@WebServlet("/TradutorController")
public class TradutorController extends HttpServlet{
    
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException{
         
          
          String var = request.getParameter("palavradigitada");
          Leitura ler = new Leitura();
          var = ler.palavras(var);
          
          request.setAttribute("palavra", var);
          
          request.getRequestDispatcher("resposta.jsp").forward(request, response);
          
         
          
          
        
          
         }

   
    
}
