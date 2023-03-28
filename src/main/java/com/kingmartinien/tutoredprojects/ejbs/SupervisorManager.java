/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kingmartinien.tutoredprojects.ejbs;

import com.kingmartinien.tutoredprojects.entities.Supervisor;
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
public class SupervisorManager {

    @PersistenceContext(unitName = "tutoredPU")
    private EntityManager em;

    /**
     * Get All The Supervisors stored in The database
     *
     * @return a list of all supervisors stored in database
     */
    public List<Supervisor> getAllSupervisors() {
        Query query = em.createNamedQuery("Supervisor.findAll");
        return query.getResultList();
    }

    /**
     * Update information of a supervisor
     *
     * @param supervisor The supervisor's information to update
     * @return The updated supervisor's information
     */
    public Supervisor updateSupervisor(Supervisor supervisor) {
        return em.merge(supervisor);
    }

    /**
     * Add a new Supervisor in the database
     *
     * @param supervisor The new Supervisor to store in the database
     */
    public void addSupervisor(Supervisor supervisor) {
        em.persist(supervisor);
    }

    /**
     * Delete a Supervisor to the database
     *
     * @param supervisor The supervisor to remove
     */
    public void deleteSupervisor(Supervisor supervisor) {
        em.remove(supervisor);
    }
}
