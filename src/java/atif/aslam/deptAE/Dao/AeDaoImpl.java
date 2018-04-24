/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAE.Dao;

import atif.aslam.deptAE.Model.DeptAe;
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
public class AeDaoImpl implements AeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addAe(DeptAe deptAe) {
        sessionFactory.getCurrentSession().save(deptAe);
    }

    @Override
    public void updateAe(DeptAe deptAe) {
        sessionFactory.getCurrentSession().update(deptAe);
    }

    @Override
    public List<DeptAe> listAe() {
        return sessionFactory.getCurrentSession().createQuery("from DeptAe").list();
    }

    @Override
    public DeptAe getAeById(Integer aeId) {
        Session session = sessionFactory.getCurrentSession();

        List<DeptAe> list = session.createQuery("from DeptAe p where p.id=:aeid").setParameter("aeid", aeId).list();
        return list.size() > 0 ? (DeptAe) list.get(0) : null;
    }

    @Override
    public void removeAe(Integer aeId) {
        DeptAe deptAe = (DeptAe) sessionFactory.getCurrentSession().load(DeptAe.class, aeId);
        if (deptAe != null) {
            sessionFactory.getCurrentSession().delete(deptAe);
        }
    }

}
