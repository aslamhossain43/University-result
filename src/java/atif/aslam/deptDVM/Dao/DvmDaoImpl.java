/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptDVM.Dao;

import atif.aslam.deptDVM.Model.DeptDvm;
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
public class DvmDaoImpl implements DvmDao{
  @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void addDvm(DeptDvm deptDvm) {
 sessionFactory.getCurrentSession().save(deptDvm);
    }

    @Override
    public void updateDvm(DeptDvm deptDvm) {
 sessionFactory.getCurrentSession().update(deptDvm);
    }

    @Override
    public List<DeptDvm> listDvm() {
 return sessionFactory.getCurrentSession().createQuery("from DeptDvm").list();
    }

    @Override
    public DeptDvm getDvmById(Integer dvmId) {
 Session session = sessionFactory.getCurrentSession();
        List<DeptDvm> list = session.createQuery("from DeptDvm p where p.id=:dvmid").setParameter("dvmid", dvmId).list();
        return list.size() > 0 ? (DeptDvm) list.get(0) : null;
    }

    @Override
    public void removeDvm(Integer dvmId) {
 DeptDvm deptDvm = (DeptDvm) sessionFactory.getCurrentSession().load(DeptDvm.class, dvmId);
        if (deptDvm != null) {
            sessionFactory.getCurrentSession().delete(deptDvm);
        }
    }
    
}
