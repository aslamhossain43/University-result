/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCSE.Dao;

import atif.aslam.deptCSE.Model.DeptCse;
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
public class CseDaoImpl implements CseDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCse(DeptCse deptCse) {

        sessionFactory.getCurrentSession().save(deptCse);
    }

    @Override
    public void updateCse(DeptCse deptCse) {
        sessionFactory.getCurrentSession().update(deptCse);

    }

    @Override
    public List<DeptCse> listCse() {
        return sessionFactory.getCurrentSession().createQuery("from DeptCse").list();
    }

    @Override
    public DeptCse getCseById(Integer cseId) {
        Session session = sessionFactory.getCurrentSession();

        List<DeptCse> list = session.createQuery("from DeptCse p where p.id=:cseid").setParameter("cseid", cseId).list();
        return list.size() > 0 ? (DeptCse) list.get(0) : null;

    }

    @Override
    public void removeCse(Integer cseId) {

        DeptCse deptCse = (DeptCse) sessionFactory.getCurrentSession().load(DeptCse.class, cseId);
        if (deptCse != null) {
            sessionFactory.getCurrentSession().delete(deptCse);
        }
    }

}
