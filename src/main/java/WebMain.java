import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Created by master on 14.11.2016.
 */
public class WebMain {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(MyServlet.class,"/"); //второй аргумент - путь на сайте, первый - имя класса сервлета. который будет обрабатывать запосы на пути
        server.setHandler(handler);
        server.start();
    }
}
