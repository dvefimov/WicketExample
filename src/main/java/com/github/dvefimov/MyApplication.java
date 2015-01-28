package com.github.dvefimov;

import com.github.dvefimov.hello.Hello;
import com.github.dvefimov.login.SimpleLoginPage;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Created by DEfimov on 28.01.15.
 */
public class MyApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
//        return Hello.class; //return default page
        return SimpleLoginPage.class; //return default page
    }

    @Override
    public void init()
    {
        super.init();
        // add your configuration here
    }
}