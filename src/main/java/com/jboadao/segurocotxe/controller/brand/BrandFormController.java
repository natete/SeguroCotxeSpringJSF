package com.jboadao.segurocotxe.controller.brand;

import com.jboadao.segurocotxe.business.BrandBusinessLogic;
import com.jboadao.segurocotxe.model.Brand;
import lombok.Getter;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "brandFormController")
@ELBeanName(value = "brandFormController")
@Join(path = "/brands/new", to = "/brands/brand-form.jsf")
public class BrandFormController {

    private final BrandBusinessLogic brandBusinessLogic;

    @Getter
    private Brand brand = new Brand();

    @Autowired
    public BrandFormController(BrandBusinessLogic brandBusinessLogic) {
        this.brandBusinessLogic = brandBusinessLogic;
    }

    public String save() {
        brandBusinessLogic.saveBrand(brand);
        brand = new Brand();

        return "/brands/brand-list.xhtml?faces-redirect=true";
    }
}
