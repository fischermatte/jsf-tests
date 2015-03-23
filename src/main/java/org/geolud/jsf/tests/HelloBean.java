package org.geolud.jsf.tests;

import javax.annotation.PostConstruct;
import javax.inject.Named;

@Named
public class HelloBean {
    private String message;

    @PostConstruct
    private void onPostConstruct() {
        this.message = "huhu";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
