package com.github.dvefimov.login;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.StatelessForm;
import org.apache.wicket.markup.html.form.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by DEfimov on 28.01.15.
 */
public class SimpleLoginPage extends WebPage {
    private static final Logger log = LoggerFactory.getLogger(SimpleLoginPage.class);

    public SimpleLoginPage(){
        super();

        LoginForm form = new LoginForm("loginForm");
        add(form);
    }
}
