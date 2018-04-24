/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFIN.Dao;

import atif.aslam.deptFIN.Model.DeptFin;
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
public class FinDaoImpl implements FinDao{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addFin(DeptFin deptFin) {

  sessionFactory.getCurrentSession().save(deptFin);
    }

    @Override
    public void updateFin(DeptFin deptFin) {

  sessionFactory.getCurrentSession().update(deptFin);
    }

    @Override
    public List<DeptFin> listFin() {
 return sessionFactory.getCurrentSession().createQuery("from DeptFin").list();
    }

    @Override
    public DeptFin getFinById(Integer finId) {

  Session session = sessionFactory.getCurrentSession();
        List<DeptFin> list = session.createQuery("from DeptFin p where p.id=:finid").setParameter("finid", finId).list();
        return list.size() > 0 ? (DeptFin) list.get(0) : null;
    }

    @Override
    public void removeFin(Integer finId) {
  DeptFin deptFin = (DeptFin) sessionFactory.getCurrentSession().load(DeptFin.class, finId);
        if (deptFin != null) {
            sessionFactory.getCurrentSession().delete(deptFin);
        }

    }
}
