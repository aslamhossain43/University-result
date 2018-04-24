/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptSOC.Dao;

import atif.aslam.deptSOC.Model.DeptSoc;
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
public class SocDaoImpl implements SocDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addSoc(DeptSoc deptSoc) {
        sessionFactory.getCurrentSession().save(deptSoc);
    }

    @Override
    public void updateSoc(DeptSoc deptSoc) {
        sessionFactory.getCurrentSession().update(deptSoc);
    }

    @Override
    public List<DeptSoc> listSoc() {
        return sessionFactory.getCurrentSession().createQuery("from DeptSoc").list();
    }

    @Override
    public DeptSoc getSocById(Integer socId) {
        Session session = sessionFactory.getCurrentSession();
        List<DeptSoc> list = session.createQuery("from DeptSoc p where p.id=:socid").setParameter("socid", socId).list();
        return list.size() > 0 ? (DeptSoc) list.get(0) : null;
    }

    @Override
    public void removeSoc(Integer socId) {
        DeptSoc deptSoc = (DeptSoc) sessionFactory.getCurrentSession().load(DeptSoc.class, socId);
        if (deptSoc != null) {
            sessionFactory.getCurrentSession().delete(deptSoc);
        }
    }

}
