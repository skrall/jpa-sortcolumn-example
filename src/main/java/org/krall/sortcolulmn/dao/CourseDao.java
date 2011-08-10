package org.krall.sortcolulmn.dao;

import org.krall.sortcolulmn.model.Course;

/**
 * Created by IntelliJ IDEA.
 * User: skrall
 * Date: 8/9/11
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CourseDao {
    void persist(Course course);
}
