package com.github.dvefimov.hello;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by DEfimov on 28.01.15.
 */
public class Hello extends WebPage {
    private static final Logger log = LoggerFactory.getLogger(Hello.class);
    private static final long serialVersionUID = 1L;

    public Hello(final PageParameters parameters) {
        log.debug("------------------ Wicket Hello world page start! ----------------");
        add(new Label("message", "Hello World, Wicket"));

        add(new Link("link"){
            @Override
            public void onClick() {
//we redirect browser to another page.
                RedirectPage anotherPage = new RedirectPage();
                setResponsePage(anotherPage);            }
        });
    }
}