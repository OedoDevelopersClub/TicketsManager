/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tsubasa
 */
package net.oekora.tickets;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ProfileBean {
    public String showProfile(){
        return "profile.xhtml";
    }
    
}
