package org.krall.sortcolulmn.dao;

import org.krall.sortcolulmn.model.Student;

/**
 * Created by IntelliJ IDEA.
 * User: skrall
 * Date: 8/9/11
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public interface StudentDao {
    void persist(Student student);
}
