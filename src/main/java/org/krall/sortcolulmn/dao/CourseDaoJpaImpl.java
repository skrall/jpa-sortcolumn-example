package org.krall.sortcolulmn.dao;

import org.krall.sortcolulmn.model.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CourseDaoJpaImpl implements CourseDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public void persist(Course course) {
        em.persist(course);
    }

}
