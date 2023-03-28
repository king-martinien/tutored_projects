/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kingmartinien.tutoredprojects.ejbs;

import com.kingmartinien.tutoredprojects.entities.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author kingmartinien
 */
@Stateless
public class StudentManager {

    @PersistenceContext(unitName = "tutoredPU")
    private EntityManager em;

    /**
     * Get All The Students stored in the database
     *
     * @return A list of Students
     */
    public List<Student> getAllStudents() {
        Query query = em.createNamedQuery("Student.findAll");
        return query.getResultList();
    }
}
