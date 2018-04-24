/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptEEE.Dao;

import atif.aslam.deptEEE.Model.DeptEee;
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
public class EeeDaoImpl implements EeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addEee(DeptEee deptEee) {
        sessionFactory.getCurrentSession().save(deptEee);
    }

    @Override
    public void updateEee(DeptEee deptEee) {
        sessionFactory.getCurrentSession().update(deptEee);
    }

    @Override
    public List<DeptEee> listEee() {
        return sessionFactory.getCurrentSession().createQuery("from DeptEee").list();
    }

    @Override
    public DeptEee getEeeById(Integer eeeId) {
        Session session = sessionFactory.getCurrentSession();
        List<DeptEee> list = session.createQuery("from DeptEee p where p.id=:eeeid").setParameter("eeeid", eeeId).list();
        return list.size() > 0 ? (DeptEee) list.get(0) : null;
    }

    @Override
    public void removeEee(Integer eeeId) {
        DeptEee deptEee = (DeptEee) sessionFactory.getCurrentSession().load(DeptEee.class, eeeId);
        if (deptEee != null) {
            sessionFactory.getCurrentSession().delete(deptEee);
        }
    }

}
