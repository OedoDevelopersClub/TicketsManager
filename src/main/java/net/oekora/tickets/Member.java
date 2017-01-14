/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.oekora.tickets;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author tsubasa
 */
@Entity
public class Member {
    @Id @NotNull
    private Integer id;                     // ID
    private String  email;                  // メールアドレス
    private String  encrypted_password;     // 暗号化されたパスワード
    private String  name;                   // 氏名
    private Integer part;                   // パート 0:Top 1:Sec 2:Bari 3:Bass
    private Integer classification;         // 団員区分 0:一般 1:学生 2:地方 3:地方学生
    private Integer permisson;              // 権限 0:一般 1:管理者

    public Member() {
        ;
    }
    
    public Member(Integer id, String email, String name, Integer part, Integer classification, Integer permission){
        this.id = id;
        this.email = email;
        this.encrypted_password = this.getEncrypedString("sentakuya");
        this.name = name;
        this.part = part;
        this.classification = classification;
        this.permisson = permission;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncrypted_password() {
        return encrypted_password;
    }

    public void setEncrypted_password(String encrypted_password) {
        this.encrypted_password = encrypted_password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPart() {
        return part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public Integer getPermisson() {
        return permisson;
    }

    public void setPermisson(Integer permisson) {
        this.permisson = permisson;
    }

    // MD5ハッシュを取得する
    public String getEncrypedString(String source) {
        MessageDigest md = null;
        StringBuilder sb = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(source.getBytes());
        sb = new StringBuilder();
        for (byte b : md.digest()) {
            String hex = String.format("%02x", b);
            sb.append(hex);
        }
        return sb.toString();
    }

}
