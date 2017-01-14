/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.oekora.tickets;

import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author tsubasa
 */
@Named
@RequestScoped

public class AdminMemberBean {

    /**
     * @return the partItems
     */
    public static Map<String, Integer> getPartItems() {
        return partItems;
    }

    /**
     * @param aPartItems the partItems to set
     */
    public static void setPartItems(Map<String, Integer> aPartItems) {
        partItems = aPartItems;
    }

    /**
     * @return the classItems
     */
    public static Map<String, Integer> getClassItems() {
        return classItems;
    }

    /**
     * @param aClassItems the classItems to set
     */
    public static void setClassItems(Map<String, Integer> aClassItems) {
        classItems = aClassItems;
    }

    /**
     * @return the permissionItems
     */
    public static Map<String, Integer> getPermissionItems() {
        return permissionItems;
    }

    /**
     * @param aPermissionItems the permissionItems to set
     */
    public static void setPermissionItems(Map<String, Integer> aPermissionItems) {
        permissionItems = aPermissionItems;
    }

    public String adminMember(){
        return "adminmember.xhtml";
    }
    
    public String next(){
        return "confirmaddmember.xhtml";
    }
    private String  name;
    private String  email;
    private String  part;
    private int     classification;
    private int     permission;
    
    private static Map<String, Integer> partItems;
    private static Map<String, Integer> classItems;
    private static Map<String, Integer> permissionItems;
    
    AdminMemberBean(){
        partItems = new HashMap<>();
        classItems = new HashMap<>();
        permissionItems = new HashMap<>();
        
        partItems.put("トップ", 0);
        partItems.put("セカンド", 1);
        partItems.put("バリトン", 2);
        partItems.put("ベース", 3);
        
        classItems.put("一般", 0);
        classItems.put("学生", 1);
        classItems.put("地方", 2);
        classItems.put("地方学生", 3);
        
        permissionItems.put("一般", 0);
        permissionItems.put("管理者", 1);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the part
     */
    public String getPart() {
        return part;
    }

    /**
     * @param part the part to set
     */
    public void setPart(String part) {
        this.part = part;
    }

    /**
     * @return the classification
     */
    public int getClassification() {
        return classification;
    }

    /**
     * @param classification the classification to set
     */
    public void setClassification(int classification) {
        this.classification = classification;
    }

    /**
     * @return the permission
     */
    public int getPermission() {
        return permission;
    }

    /**
     * @param permission the permission to set
     */
    public void setPermission(int permission) {
        this.permission = permission;
    }
    
}
