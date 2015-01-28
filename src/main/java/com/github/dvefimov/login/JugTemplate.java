package com.github.dvefimov.login;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by DEfimov on 28.01.15.
 */
public class JugTemplate extends WebPage {
    public static final String CONTENT_ID = "contentComponent";

    private Component headerPanel;
    private Component menuPanel;
    private Component footerPanel;

    public JugTemplate() {
        add(headerPanel = new HeaderPanel("headerPanel"));
  //      add(menuPanel = new MenuPanel("menuPanel"));
//        add(footerPanel = new FooterPanel("footerPanel"));
        add(new Label(CONTENT_ID, "Put your content here"));
    }

//getters for layout areas //…
}
