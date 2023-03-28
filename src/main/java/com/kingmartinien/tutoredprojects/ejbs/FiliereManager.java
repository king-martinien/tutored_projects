/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kingmartinien.tutoredprojects.ejbs;

import com.kingmartinien.tutoredprojects.entities.Filiere;
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
public class FiliereManager {

    @PersistenceContext(unitName = "tutoredPU")
    private EntityManager em;

    /**
     * Get All The stored Filiere
     *
     * @return A list of Filiere
     */
    public List<Filiere> getAllFilieres() {
        Query query = em.createNamedQuery("Filiere.findAll");
        return query.getResultList();
    }
}
