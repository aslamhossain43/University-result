/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFIN.Service;

import atif.aslam.deptFIN.Dao.FinDao;
import atif.aslam.deptFIN.Model.DeptFin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class FinServiceImpl implements FinService {

    @Autowired
    FinDao finDao;

    @Override
    @Transactional
    public void addFin(DeptFin deptFin) {
        finDao.addFin(deptFin);
    }

    @Override
    @Transactional
    public void updateFin(DeptFin deptFin) {
        finDao.updateFin(deptFin);
    }

    @Override
    @Transactional
    public List<DeptFin> listFin() {
        return finDao.listFin();
    }

    @Override
    @Transactional
    public DeptFin getFinById(Integer finId) {
        return finDao.getFinById(finId);
    }

    @Override
    @Transactional
    public void removeFin(Integer finId) {
        finDao.removeFin(finId);
    }

}
