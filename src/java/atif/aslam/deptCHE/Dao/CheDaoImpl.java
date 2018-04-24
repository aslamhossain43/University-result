/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCHE.Dao;

import atif.aslam.deptCHE.Model.DeptChe;
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
public class CheDaoImpl implements CheDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addChe(DeptChe deptChe) {
        sessionFactory.getCurrentSession().save(deptChe);
    }

    @Override
    public void updateChe(DeptChe deptChe) {
        sessionFactory.getCurrentSession().update(deptChe);
    }

    @Override
    public List<DeptChe> listChe() {
        return sessionFactory.getCurrentSession().createQuery("from DeptChe").list();
    }

    @Override
    public DeptChe getCheById(Integer cheId) {
        Session session = sessionFactory.getCurrentSession();
        List<DeptChe> list = session.createQuery("from DeptChe p where p.id=:cheid").setParameter("cheid", cheId).list();
        return list.size() > 0 ? (DeptChe) list.get(0) : null;
    }

    @Override
    public void removeChe(Integer cheId) {
        DeptChe deptChe = (DeptChe) sessionFactory.getCurrentSession().load(DeptChe.class, cheId);
        if (deptChe != null) {
            sessionFactory.getCurrentSession().delete(deptChe);
        }
    }

}
