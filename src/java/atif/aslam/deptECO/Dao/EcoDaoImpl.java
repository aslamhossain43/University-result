/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptECO.Dao;

import atif.aslam.deptECO.Model.DeptEco;
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
public class EcoDaoImpl implements EcoDao{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void addEco(DeptEco deptEco) {
 sessionFactory.getCurrentSession().save(deptEco);
    }

    @Override
    public void updateEco(DeptEco deptEco) {
 sessionFactory.getCurrentSession().update(deptEco);
    }

    @Override
    public List<DeptEco> listEco() {
 return sessionFactory.getCurrentSession().createQuery("from DeptEco").list();
    }

    @Override
    public DeptEco getEcoById(Integer ecoId) {
 Session session = sessionFactory.getCurrentSession();
        List<DeptEco> list = session.createQuery("from DeptEco p where p.id=:ecoid").setParameter("ecoid", ecoId).list();
        return list.size() > 0 ? (DeptEco) list.get(0) : null;

    }

    @Override
    public void removeEco(Integer ecoId) {
 DeptEco deptEco = (DeptEco) sessionFactory.getCurrentSession().load(DeptEco.class, ecoId);
        if (deptEco != null) {
            sessionFactory.getCurrentSession().delete(deptEco);
        }
    }
    
}
