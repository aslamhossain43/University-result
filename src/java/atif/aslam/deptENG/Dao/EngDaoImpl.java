/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptENG.Dao;

import atif.aslam.deptENG.Model.DeptEng;
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
public class EngDaoImpl implements EngDao{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void addEng(DeptEng deptEng) {
 sessionFactory.getCurrentSession().save(deptEng);
    }

    @Override
    public void updateEng(DeptEng deptEng) {
 sessionFactory.getCurrentSession().update(deptEng);
    }

    @Override
    public List<DeptEng> listEng() {
  return sessionFactory.getCurrentSession().createQuery("from DeptEng").list();
    }

    @Override
    public DeptEng getEngById(Integer engId) {
Session session = sessionFactory.getCurrentSession();
        List<DeptEng> list = session.createQuery("from DeptEng p where p.id=:engid").setParameter("engid", engId).list();
        return list.size() > 0 ? (DeptEng) list.get(0) : null;
    }

    @Override
    public void removeEng(Integer engId) {
 DeptEng deptEng = (DeptEng) sessionFactory.getCurrentSession().load(DeptEng.class, engId);
        if (deptEng != null) {
            sessionFactory.getCurrentSession().delete(deptEng);
        }
    }
    
}
