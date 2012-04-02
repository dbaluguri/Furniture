/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;
import springapp.service.PriceIncrease;

/**
 *
 * @author dbaluguri
 */
public class WelcomeController extends SimpleFormController{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        return new ModelAndView("welcome");
    }

    @Override
    public ModelAndView onSubmit(Object command)
            throws ServletException { 
//        int increase = ((PriceIncrease) command).getPercentage();
//        logger.info("Increasing prices by " + increase + "%."); 
//        productManager.increasePrice(increase); 
//        logger.info("returning from PriceIncreaseForm view to " + getSuccessView()); 
        return new ModelAndView(new RedirectView(getSuccessView()));
    } 
    
}
