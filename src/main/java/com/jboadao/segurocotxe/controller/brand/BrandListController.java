package com.jboadao.segurocotxe.controller.brand;

import com.jboadao.segurocotxe.business.BrandBusinessLogic;
import com.jboadao.segurocotxe.model.Brand;
import lombok.Getter;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "brandListController")
@ELBeanName(value = "brandListController")
@Join(path = "/brands", to = "/brands/brand-list.jsf")
public class BrandListController {

    private final BrandBusinessLogic brandBusinessLogic;

    @Getter
    private Iterable<Brand> brands;

    @Autowired
    public BrandListController(BrandBusinessLogic brandBusinessLogic) {
        this.brandBusinessLogic = brandBusinessLogic;
    }

    @Deferred
    @RequestAction
    @IgnorePostback
    public void loadData() {
        brands = brandBusinessLogic.findAll();
    }
}
