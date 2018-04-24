/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptECE.Dao;

import atif.aslam.deptECE.Model.DeptEce;
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
public class EceDaoImpl implements EceDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addEce(DeptEce deptEce) {
        sessionFactory.getCurrentSession().save(deptEce);
    }

    @Override
    public void updateEce(DeptEce deptEce) {
        sessionFactory.getCurrentSession().update(deptEce);
    }

    @Override
    public List<DeptEce> listEce() {
        return sessionFactory.getCurrentSession().createQuery("from DeptEce").list();
    }

    @Override
    public DeptEce getEceById(Integer eceId) {

        Session session = sessionFactory.getCurrentSession();
        List<DeptEce> list = session.createQuery("from DeptEce p where p.id=:eceid").setParameter("eceid", eceId).list();
        return list.size() > 0 ? (DeptEce) list.get(0) : null;

    }

    @Override
    public void removeEce(Integer eceId) {

        DeptEce deptEce = (DeptEce) sessionFactory.getCurrentSession().load(DeptEce.class, eceId);
        if (deptEce != null) {
            sessionFactory.getCurrentSession().delete(deptEce);
        }
    }

}
