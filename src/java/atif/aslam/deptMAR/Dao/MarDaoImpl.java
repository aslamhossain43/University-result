/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAR.Dao;

import atif.aslam.deptMAR.Model.DeptMar;
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
public class MarDaoImpl implements MarDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addMar(DeptMar deptMar) {
        sessionFactory.getCurrentSession().save(deptMar);
    }

    @Override
    public void updateMar(DeptMar deptMar) {
        sessionFactory.getCurrentSession().update(deptMar);
    }

    @Override
    public List<DeptMar> listMar() {
        return sessionFactory.getCurrentSession().createQuery("from DeptMar").list();
    }

    @Override
    public DeptMar getMarById(Integer marId) {
        Session session = sessionFactory.getCurrentSession();
        List<DeptMar> list = session.createQuery("from DeptMar p where p.id=:marid").setParameter("marid", marId).list();
        return list.size() > 0 ? (DeptMar) list.get(0) : null;
    }

    @Override
    public void removeMar(Integer marId) {
        DeptMar deptMar = (DeptMar) sessionFactory.getCurrentSession().load(DeptMar.class, marId);
        if (deptMar != null) {
            sessionFactory.getCurrentSession().delete(deptMar);
        }
    }

}
