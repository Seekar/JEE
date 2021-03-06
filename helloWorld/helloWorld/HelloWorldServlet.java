package helloWorld;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A Servlet which reads a list of strings and prints it sorted.
 * @author Bruno Zanuttini, Universit&eacute; de Caen Basse-Normandie, France.
 * @since January, 2012
 */
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        this.log("Une exécution de la servlet...");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=null;
        try {
            out=resp.getWriter();
        } catch (IOException e) {
            out.close();
            throw e;
        }

        // HTML Header
        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"fr\" lang=\"fr\">");
        out.println("<head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
        out.println("<title>Tri de cha&icirc;nes de caract&egrave;res</title>");
        out.println("</head>");
        out.println("<body>");
        String nom = req.getParameter("nom");
        out.println("<h1>Hello "+nom+ " !</h1>");

        // Closing
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}
