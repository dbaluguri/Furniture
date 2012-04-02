/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furniture.login;

import com.furniture.domain.LoginCredentails;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author dbaluguri
 */
public class LoginInfoValidator implements Validator {
    
    
    protected final Log logger = LogFactory.getLog(getClass()); 
    
    @Override
    public boolean supports(Class clazz) {
        return LoginCredentails.class.equals(clazz);
    } 
    
    @Override
    public void validate(Object obj, Errors errors) {
        LoginCredentails info = (LoginCredentails) obj;
           
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "name.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
        
        
        if (!info.getUserName().equals("Dilip")) {
               errors.rejectValue("userName", "name.required");
                   
        }
        if (!info.getPassword().equals("Password")) {
            errors.rejectValue("password", "password.required");
        }
    } 
    
}
