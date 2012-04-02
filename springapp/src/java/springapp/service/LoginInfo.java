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
public class LoginInfo implements Validator {
    
    private String userName;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean supports(Class clazz) {
        return LoginInfo.class.equals(clazz);
    }

    @Override
    public void validate(Object o, Errors errors) {
        
        LoginInfo info = (LoginInfo) o;
        
        if (info.getUserName().equals("Dilip") && info.getPassword().equals("password")) {
            
        } 
    }
    
    
}
