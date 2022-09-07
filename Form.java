package com.waheed.Demo.model;

import javax.persistence.*;

@Entity(name="FORMTABLE")
@Table(name="FORMTABLE")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FORM_ID")
    private String formId;

    @Column(name = "EMAIL_ID")
    private String emailId;

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
