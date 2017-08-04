package com.jboadao.segurocotxe.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "homeController")
@ELBeanName(value = "homeController")
@Join(path = "/", to = "/index.jsf")
public class HomeController {
}
