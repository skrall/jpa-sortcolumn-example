package org.krall.sortcolulmn.main;

import org.krall.sortcolulmn.dao.CourseDao;
import org.krall.sortcolulmn.dao.StudentDao;
import org.krall.sortcolulmn.model.Course;
import org.krall.sortcolulmn.model.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");

        CourseDao courseDao = (CourseDao)applicationContext.getBean("courseDaoJpaImpl");
        StudentDao studentDao = (StudentDao)applicationContext.getBean("studentDaoJpaImpl");

        Course c1 = new Course();
        c1.setCourseName("Course 1");
        courseDao.persist(c1);

        Course c2 = new Course();
        c2.setCourseName("Course 2");
        courseDao.persist(c2);

        List<Course> courseList = new ArrayList<Course>();
        courseList.add(c1);
        courseList.add(c2);


        Student s = new Student();
        s.setName("Test Student");
        s.setCourses(courseList);

        studentDao.persist(s);
    }
}
