package br.com.cazuzaneto.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.cazuzaneto.model.AlunoEntity;

@Repository
public class AlunoPersistence {

    @PersistenceContext
    private EntityManager entityManager;

    public void persistir(AlunoEntity entity) {
        this.entityManager.persist(entity);
    }

    public AlunoEntity buscar(Long id) {
        return this.entityManager.find(AlunoEntity.class, id);
    }

    public void remover(AlunoEntity alunoEntity) {
        this.entityManager.remove(alunoEntity);
    }

    public void atualizar(AlunoEntity alunoEntity){
        this.entityManager.merge(alunoEntity);
    }

}