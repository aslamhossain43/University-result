/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptACO.Dao;

import atif.aslam.deptACO.Model.DeptAco;
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
public class AcoDaoImpl implements AcoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addAco(DeptAco deptAco) {
        sessionFactory.getCurrentSession().save(deptAco);
    }

    @Override
    public void updateAco(DeptAco deptAco) {
        sessionFactory.getCurrentSession().update(deptAco);
    }

    @Override
    public List<DeptAco> listAco() {
        return sessionFactory.getCurrentSession().createQuery("from DeptAco").list();
    }

    @Override
    public DeptAco getAcoById(Integer acoId) {
        Session session = sessionFactory.getCurrentSession();

        List<DeptAco> list = session.createQuery("from DeptAco p where p.id=:acoid").setParameter("acoid", acoId).list();
        return list.size() > 0 ? (DeptAco) list.get(0) : null;
    }

    @Override
    public void removeAco(Integer acoId) {

        DeptAco deptAco = (DeptAco) sessionFactory.getCurrentSession().load(DeptAco.class, acoId);
       
        if (deptAco != null) {
            sessionFactory.getCurrentSession().delete(deptAco);
        }
    }

}
