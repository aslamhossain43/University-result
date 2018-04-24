/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptME.Dao;

import atif.aslam.deptME.Model.DeptMe;
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
public class MeDaoImpl implements MeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addMe(DeptMe deptMe) {
        sessionFactory.getCurrentSession().save(deptMe);
    }

    @Override
    public void updateMe(DeptMe deptMe) {
        sessionFactory.getCurrentSession().update(deptMe);
    }

    @Override
    public List<DeptMe> listMe() {
        return sessionFactory.getCurrentSession().createQuery("from DeptMe").list();
    }

    @Override
    public DeptMe getMeById(Integer meId) {
        Session session = sessionFactory.getCurrentSession();
        List<DeptMe> list = session.createQuery("from DeptMe p where p.id=:meid").setParameter("meid", meId).list();
        return list.size() > 0 ? (DeptMe) list.get(0) : null;
    }

    @Override
    public void removeMe(Integer meId) {

        DeptMe deptMe = (DeptMe) sessionFactory.getCurrentSession().load(DeptMe.class, meId);
        if (deptMe != null) {
            sessionFactory.getCurrentSession().delete(deptMe);
        }
    }

}
