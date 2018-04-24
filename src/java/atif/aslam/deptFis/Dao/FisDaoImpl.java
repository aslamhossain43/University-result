/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFis.Dao;

import atif.aslam.deptFis.Model.DeptFis;
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
public class FisDaoImpl implements FisDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addFis(DeptFis deptFis) {
        sessionFactory.getCurrentSession().save(deptFis);
    }

    @Override
    public void updateFis(DeptFis deptFis) {
        sessionFactory.getCurrentSession().update(deptFis);
    }

    @Override
    public List<DeptFis> listFis() {
        return sessionFactory.getCurrentSession().createQuery("from DeptFis").list();
    }

    @Override
    public DeptFis getFisById(Integer fisId) {
        Session session = sessionFactory.getCurrentSession();
        List<DeptFis> list = session.createQuery("from DeptFis p where p.id=:fisid").setParameter("fisid", fisId).list();
        return list.size() > 0 ? (DeptFis) list.get(0) : null;
    }

    @Override
    public void removeFis(Integer fisId) {
        DeptFis deptFis = (DeptFis) sessionFactory.getCurrentSession().load(DeptFis.class, fisId);
        if (deptFis != null) {
            sessionFactory.getCurrentSession().delete(deptFis);
        }
    }

}
