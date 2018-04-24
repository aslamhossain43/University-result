/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAgriculture.Dao;

import atif.aslam.deptAgriculture.Model.Deptag;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Atif Aslam
 */
@Repository
public class AgDaoImpl implements AgDao{
     @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void addAg(Deptag deptag) {
        sessionFactory.getCurrentSession().save(deptag);
        
    }
    
    @Override
    public void updateAg(Deptag deptag) {
        sessionFactory.getCurrentSession().update(deptag);
        
    }
    
    @Override
    public List<Deptag> listAg() {
        return sessionFactory.getCurrentSession().createQuery("from Deptag").list();
    }
    
    @Override
    public Deptag getAgById(Integer agId) {
        Session session = sessionFactory.getCurrentSession();
        
        List<Deptag> list = session.createQuery("from Deptag p where p.id=:agid").setParameter("agid", agId).list();
        return list.size() > 0 ? (Deptag) list.get(0) : null;
    }
    
    @Override
    public void removeAg(Integer agId) {
        Deptag deptag = (Deptag) sessionFactory.getCurrentSession().load(Deptag.class, agId);
        if (deptag != null) {
            sessionFactory.getCurrentSession().delete(deptag);
        }
    }
    
}
