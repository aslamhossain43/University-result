/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptEEE.Service;

import atif.aslam.deptEEE.Dao.EeeDao;
import atif.aslam.deptEEE.Model.DeptEee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class EeeServiceImpl implements EeeService {

    @Autowired
    EeeDao eeeDao;

    @Override
    @Transactional
    public void addEee(DeptEee deptEee) {
        eeeDao.addEee(deptEee);
    }

    @Override
    @Transactional
    public void updateEee(DeptEee deptEee) {
        eeeDao.updateEee(deptEee);
    }

    @Override
    @Transactional
    public List<DeptEee> listEee() {
        return eeeDao.listEee();
    }

    @Override
    @Transactional
    public DeptEee getEeeById(Integer eeeId) {
        return eeeDao.getEeeById(eeeId);
    }

    @Override
    @Transactional
    public void removeEee(Integer eeeId) {
        eeeDao.removeEee(eeeId);
    }

}
