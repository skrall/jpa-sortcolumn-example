package org.krall.sortcolulmn.dao;

import org.krall.sortcolulmn.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class StudentDaoJpaImpl implements StudentDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public void persist(Student student) {
        em.persist(student);
    }

}
