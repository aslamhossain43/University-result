/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptPHY.Dao;

import atif.aslam.deptPHY.Model.DeptPhy;
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
public class PhyDaoImpl implements PhyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPhy(DeptPhy deptPhy) {
        sessionFactory.getCurrentSession().save(deptPhy);
    }

    @Override
    public void updatePhy(DeptPhy deptPhy) {
        sessionFactory.getCurrentSession().update(deptPhy);
    }

    @Override
    public List<DeptPhy> listPhy() {
        return sessionFactory.getCurrentSession().createQuery("from DeptPhy").list();
    }

    @Override
    public DeptPhy getPhyById(Integer phyId) {

        Session session = sessionFactory.getCurrentSession();
        List<DeptPhy> list = session.createQuery("from DeptPhy p where p.id=:phyid").setParameter("phyid", phyId).list();
        return list.size() > 0 ? (DeptPhy) list.get(0) : null;
    }

    @Override
    public void removePhy(Integer phyId) {
        DeptPhy deptPhy = (DeptPhy) sessionFactory.getCurrentSession().load(DeptPhy.class, phyId);
        if (deptPhy != null) {
            sessionFactory.getCurrentSession().delete(deptPhy);
        }

    }

}
