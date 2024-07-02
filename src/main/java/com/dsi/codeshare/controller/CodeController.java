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
@RequestScoped
public class CodeController implements Serializable {
    private CodeEntity codeEntity = new CodeEntity();

    private Long id = 0L;


    @Inject
    private CodeEntityService service;

    public void submit() throws IOException {
        service.create(codeEntity);
        FacesContext.getCurrentInstance().getExternalContext().redirect("viewCode.xhtml");
    }
    public void read(long id) throws IOException {
        codeEntity = service.read(id);
    }
    public CodeEntity setCodeEntity(CodeEntity codeEntity) {
        this.codeEntity = codeEntity;
        System.out.println("called setCodeEntity");
        return codeEntity;
    }
    public CodeEntity getCodeEntity() {
        return codeEntity;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
