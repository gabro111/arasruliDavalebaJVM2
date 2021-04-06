package ge.btu.nika.gabrichidze.currency.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class currencyServlet {
    @WebServlet("/userservlet")
    public class UserServlet extends HttpServlet {

        public static final String VIEW = "/checkCurrency.jsp";


        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            RequestDispatcher view = req.getRequestDispatcher(VIEW);
            view.forward(req, resp);
        }
    }
}
