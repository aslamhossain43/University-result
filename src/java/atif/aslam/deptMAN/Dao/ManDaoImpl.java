/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAN.Dao;

import atif.aslam.deptMAN.Model.DeptMan;
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
public class ManDaoImpl implements ManDao{
 @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addMan(DeptMan deptMan) {
 sessionFactory.getCurrentSession().save(deptMan);
    }

    @Override
    public void updateMan(DeptMan deptMan) {
  sessionFactory.getCurrentSession().update(deptMan);
    }

    @Override
    public List<DeptMan> listMan() {
 return sessionFactory.getCurrentSession().createQuery("from DeptMan").list();
    }

    @Override
    public DeptMan getManById(Integer manId) {
 Session session = sessionFactory.getCurrentSession();
        List<DeptMan> list = session.createQuery("from DeptMan p where p.id=:manid").setParameter("manid", manId).list();
        return list.size() > 0 ? (DeptMan) list.get(0) : null;
    }

    @Override
    public void removeMan(Integer manId) {
 DeptMan deptMan = (DeptMan) sessionFactory.getCurrentSession().load(DeptMan.class, manId);
        if (deptMan != null) {
            sessionFactory.getCurrentSession().delete(deptMan);
        }
    }
    
}
