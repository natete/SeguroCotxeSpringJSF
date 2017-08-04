package com.jboadao.segurocotxe.config;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class Initializer implements ServletContextInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        servletContext.setInitParameter("BootsFaces_THEME", "cerulean");
        servletContext.setInitParameter("BootsFaces_USETHEME", "true");
        servletContext.setInitParameter("net.bootsfaces.get_jquery_from_cdn", "false");
    }
}
