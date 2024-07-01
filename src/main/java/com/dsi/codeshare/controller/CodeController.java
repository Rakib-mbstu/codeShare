package com.dsi.codeshare.controller;

import com.dsi.codeshare.entity.CodeEntity;
import com.dsi.codeshare.service.CodeEntityService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.IOException;
import java.io.Serializable;


@Named("codes")
@SessionScoped
public class CodeController implements Serializable {
    private CodeEntity codeEntity = new CodeEntity();

    @Inject
    private CodeEntityService service;

    public String submit() throws IOException {
        service.create(codeEntity);
//        return "viewCode";
//        FacesContext.getCurrentInstance().getExternalContext().dispatch("viewCode");
        FacesContext.getCurrentInstance().getExternalContext().redirect("viewCode");
        return "";
    }
    public CodeEntity setCodeEntity(CodeEntity codeEntity) {
        this.codeEntity = codeEntity;
        System.out.println("called setCodeEntity");
        return codeEntity;
    }
    public CodeEntity getCodeEntity() {
        return codeEntity;
    }
}
