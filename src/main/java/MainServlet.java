

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "TestServlet", urlPatterns = "/get")// что такое юрл паттерн?
// Если в запросен есть /testservlet то  начнет работу этот сервлет
// Как и откуда полчить запрос? И каким обьектом в приложенини он является?
public class MainServlet implements Servlet {


    private static Logger logger = LoggerFactory.getLogger(MainServlet.class);
    private transient ServletConfig servletConfig;


    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("new oer request");
        res.getWriter().print("Hello!!!");
        logger.info("This work the end.");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
