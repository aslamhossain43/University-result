/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFPE.Dao;

import atif.aslam.deptFPE.Model.DeptFpe;
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
public class FpeDaoImpl implements FpeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addFpe(DeptFpe deptFpe) {
        sessionFactory.getCurrentSession().save(deptFpe);
    }

    @Override
    public void updateFpe(DeptFpe deptFpe) {
        sessionFactory.getCurrentSession().update(deptFpe);
    }

    @Override
    public List<DeptFpe> listFpe() {
        return sessionFactory.getCurrentSession().createQuery("from DeptFpe").list();
    }

    @Override
    public DeptFpe getFpeById(Integer fpeId) {
        Session session = sessionFactory.getCurrentSession();
        List<DeptFpe> list = session.createQuery("from DeptFpe p where p.id=:fpeid").setParameter("fpeid", fpeId).list();
        return list.size() > 0 ? (DeptFpe) list.get(0) : null;
    }

    @Override
    public void removeFpe(Integer fpeId) {
        DeptFpe deptFpe = (DeptFpe) sessionFactory.getCurrentSession().load(DeptFpe.class, fpeId);
        if (deptFpe != null) {
            sessionFactory.getCurrentSession().delete(deptFpe);
        }
    }

}
