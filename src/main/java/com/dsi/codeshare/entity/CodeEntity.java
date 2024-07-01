package com.dsi.codeshare.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
public class CodeEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private @NotNull String codeText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCodeText() {
        return codeText;
    }
    public void setCodeText(String codeText) {
        this.codeText = codeText;
    }
}
