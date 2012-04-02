/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.service;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author dbaluguri
 */
public class LoginInfoValidator implements Validator {

    @Override
    public boolean supports(Class clazz) {
        return LoginInfo.class.equals(clazz);
    }

    @Override
    public void validate(Object o, Errors errors) {
        
        LoginInfo info = (LoginInfo) o;
        
        if (info.getUserName().equals("Dilip") && info.getPassword().equals("password")) {
            
        } else {
            errors.rejectValue("percentage", "error.too-low", "Value too low.");
        }
    }
    
    
    
}
