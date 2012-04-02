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
import springapp.service.LoginInfo;
import springapp.service.PriceIncrease;

/**
 *
 * @author dbaluguri
 */
public class WelcomeController extends SimpleFormController{

       
    @Override
    public ModelAndView onSubmit(Object command)
            throws ServletException { 
        
//        int increase = ((PriceIncrease) command).getPercentage();
//        logger.info("Increasing prices by " + increase + "%."); 
//        productManager.increasePrice(increase); 
//        logger.info("returning from PriceIncreaseForm view to " + getSuccessView()); 
        return new ModelAndView(new RedirectView(getSuccessView()));
    } 
    
    @Override
    protected Object formBackingObject(HttpServletRequest request) throws ServletException {
        LoginInfo info = new LoginInfo();
        info.setUserName("email");
        info.setPassword("password");
//        PriceIncrease priceIncrease = new PriceIncrease();
//        priceIncrease.setPercentage(20);
//        return priceIncrease;
        return info;
    }
    
}
