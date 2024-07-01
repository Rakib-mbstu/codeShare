package com.dsi.codeshare.service;

import com.dsi.codeshare.entity.CodeEntity;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class CodeEntityService {
    @PersistenceContext(unitName = "entityDB")
    private EntityManager entityManager;

    public void create(CodeEntity codeEntity) {
        entityManager.persist(codeEntity);
    }

    public CodeEntity read(Long id) {
        return entityManager.find(CodeEntity.class, id);
    }

}
