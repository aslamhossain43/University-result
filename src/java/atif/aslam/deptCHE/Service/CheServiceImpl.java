/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCHE.Service;

import atif.aslam.deptCHE.Dao.CheDao;
import atif.aslam.deptCHE.Model.DeptChe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class CheServiceImpl implements CheService {

    @Autowired
    CheDao cheDao;

    @Override
    @Transactional
    public void addChe(DeptChe deptChe) {
        cheDao.addChe(deptChe);
    }

    @Override
    @Transactional
    public void updateChe(DeptChe deptChe) {
        cheDao.updateChe(deptChe);
    }

    @Override
    @Transactional
    public List<DeptChe> listChe() {
        return cheDao.listChe();
    }

    @Override
    @Transactional
    public DeptChe getCheById(Integer cheId) {
        return cheDao.getCheById(cheId);
    }

    @Override
    @Transactional
    public void removeChe(Integer cheId) {
        cheDao.removeChe(cheId);
    }

}
