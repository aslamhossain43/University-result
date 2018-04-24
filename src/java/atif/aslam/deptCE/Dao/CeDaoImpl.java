/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCE.Dao;

import atif.aslam.deptCE.Model.DeptCe;
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
public class CeDaoImpl implements CeDao{
 @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCe(DeptCe deptCe) {
        sessionFactory.getCurrentSession().save(deptCe);
    }

    @Override
    public void updateCe(DeptCe deptCe) {
        sessionFactory.getCurrentSession().update(deptCe);
    }

    @Override
    public List<DeptCe> listCe() {
        return sessionFactory.getCurrentSession().createQuery("from DeptCe").list();
    }

    @Override
    public DeptCe getCeById(Integer ceId) {
        Session session = sessionFactory.getCurrentSession();
        List<DeptCe> list = session.createQuery("from DeptCe p where p.id=:ceid").setParameter("ceid", ceId).list();
        return list.size() > 0 ? (DeptCe) list.get(0) : null;
    }

    @Override
    public void removeCe(Integer ceId) {
        DeptCe deptCe = (DeptCe) sessionFactory.getCurrentSession().load(DeptCe.class, ceId);
        if (deptCe != null) {
            sessionFactory.getCurrentSession().delete(deptCe);
        }
    }

}
