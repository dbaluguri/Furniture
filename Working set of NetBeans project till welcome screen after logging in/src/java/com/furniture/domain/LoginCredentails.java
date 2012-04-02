/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furniture.domain;

/**
 *
 * @author dbaluguri
 */
public class LoginCredentails {
    
    private String userName;
    
    private String password;
    
    public LoginCredentails(String userName, String password){
        
        this.userName = userName;
        this.password = password;
    }

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
    
    
    
}
