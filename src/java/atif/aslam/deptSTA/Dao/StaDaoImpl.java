/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptSTA.Dao;

import atif.aslam.deptSTA.Model.DeptSta;
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
public class StaDaoImpl implements StaDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addSta(DeptSta deptSta) {
        sessionFactory.getCurrentSession().save(deptSta);
    }

    @Override
    public void updateSta(DeptSta deptSta) {

        sessionFactory.getCurrentSession().update(deptSta);
    }

    @Override
    public List<DeptSta> listSta() {

        return sessionFactory.getCurrentSession().createQuery("from DeptSta").list();
    }

    @Override
    public DeptSta getStaById(Integer staId) {

        Session session = sessionFactory.getCurrentSession();
        List<DeptSta> list = session.createQuery("from DeptSta p where p.id=:staid").setParameter("staid", staId).list();
        return list.size() > 0 ? (DeptSta) list.get(0) : null;
    }

    @Override
    public void removeSta(Integer staId) {
        DeptSta deptSta = (DeptSta) sessionFactory.getCurrentSession().load(DeptSta.class, staId);
        if (deptSta != null) {
            sessionFactory.getCurrentSession().delete(deptSta);
        }

    }

}
