package com.furniture.web.controller; 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 
public class GenericController implements Controller { 
    protected final Log logger = LogFactory.getLog(getClass()); 
    
    private String caller;

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        logger.info("Returning hello view"); 
        return new ModelAndView(getCaller());
    } 

}