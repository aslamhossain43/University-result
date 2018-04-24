/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAT.Dao;

import atif.aslam.deptMAT.Model.DeptMat;
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
public class MatDaoImpl implements MatDao{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void addMat(DeptMat deptMat) {
 sessionFactory.getCurrentSession().save(deptMat);
    }

    @Override
    public void updateMat(DeptMat deptMat) {

 sessionFactory.getCurrentSession().update(deptMat);
    }

    @Override
    public List<DeptMat> listMat() {
 return sessionFactory.getCurrentSession().createQuery("from DeptMat").list();
    }

    @Override
    public DeptMat getMatById(Integer matId) {
 Session session = sessionFactory.getCurrentSession();
        List<DeptMat> list = session.createQuery("from DeptMat p where p.id=:matid").setParameter("matid", matId).list();
        return list.size() > 0 ? (DeptMat) list.get(0) : null;

    }

    @Override
    public void removeMat(Integer matId) {
 DeptMat deptMat = (DeptMat) sessionFactory.getCurrentSession().load(DeptMat.class, matId);
        if (deptMat != null) {
            sessionFactory.getCurrentSession().delete(deptMat);
        }

    }
    
}
