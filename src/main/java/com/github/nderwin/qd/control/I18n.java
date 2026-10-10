package com.github.nderwin.qd.control;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.Locale;
import java.util.ResourceBundle;

@ApplicationScoped
public class I18n {

    private ResourceBundle bundle;

    public I18n() {
        updateBundle();
    }

    public void updateBundle() {
        this.bundle = ResourceBundle.getBundle("messages", Locale.getDefault());
    }

    public String getMessage(String key) {
        return bundle.getString(key);
    }
}
