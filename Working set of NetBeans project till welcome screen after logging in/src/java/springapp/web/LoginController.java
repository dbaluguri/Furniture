/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.web;

import com.furniture.domain.LoginCredentails;
import com.furniture.login.LoginInfoValidator;
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
public class LoginController extends SimpleFormController{
    
    LoginCredentails loginCredentails;

    public LoginCredentails getLoginCredentails() {
        return loginCredentails;
    }

    public void setLoginCredentails(LoginCredentails loginCredentails) {
        this.loginCredentails = loginCredentails;
    }

    

    @Override
    public ModelAndView onSubmit(Object command)
            throws ServletException { 
//        int increase = ((PriceIncrease) command).getPercentage();
//        logger.info("Increasing prices by " + increase + "%."); 
//        productManager.increasePrice(increase); 
//        logger.info("returning from PriceIncreaseForm view to " + getSuccessView()); 
          //return new ModelAndView(new RedirectView(getSuccessView()));
        return new ModelAndView(new RedirectView(getSuccessView()));
    } 
    
    @Override
    protected Object formBackingObject(HttpServletRequest request) throws ServletException {
       
        LoginCredentails loginCredentails = new LoginCredentails("emailid", "password");
//        
//        loginCredentails.setUserName("email id");
//        loginCredentails.setPassword("password");
        
        return loginCredentails;
    } 
    
}
