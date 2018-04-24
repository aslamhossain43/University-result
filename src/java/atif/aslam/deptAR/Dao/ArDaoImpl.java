/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAR.Dao;

import atif.aslam.deptAR.Model.DeptAr;
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
public class ArDaoImpl implements ArDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addAr(DeptAr deptAr) {
        sessionFactory.getCurrentSession().save(deptAr);
    }

    @Override
    public void updateAr(DeptAr deptAr) {
        sessionFactory.getCurrentSession().update(deptAr);

    }

    @Override
    public List<DeptAr> listAr() {
        return sessionFactory.getCurrentSession().createQuery("from DeptAr").list();
    }

    @Override
    public DeptAr getArById(Integer arId) {
        Session session = sessionFactory.getCurrentSession();

        List<DeptAr> list = session.createQuery("from DeptAr p where p.id=:arid").setParameter("arid", arId).list();
        return list.size() > 0 ? (DeptAr) list.get(0) : null;
    }

    @Override
    public void removeAr(Integer arId) {
        DeptAr deptAr = (DeptAr) sessionFactory.getCurrentSession().load(DeptAr.class, arId);
        if (deptAr != null) {
            sessionFactory.getCurrentSession().delete(deptAr);
        }
    }
}
