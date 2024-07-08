package edu.wgu.d387_sample_code.Internationalization;

import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.ResourceBundle;

//retrieves the welcome message for a specified locale
@Component
public class MessageRetriever {

    private Locale locale;
    private ResourceBundle resourceBundle;

    public String getWelcomeMessage() {
        return resourceBundle.getString("Greeting");
    }

    public void setLocale(String language, String country) {
        locale = new Locale(language, country);
        resourceBundle = ResourceBundle.getBundle("ResourceBundle", locale);
        System.out.println(language + ", " + country);
    }
    public MessageRetriever() {
    }

    public MessageRetriever(String language, String country) {
        setLocale(language, country);
    }
}
