/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFis.Service;

import atif.aslam.deptFis.Dao.FisDao;
import atif.aslam.deptFis.Model.DeptFis;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class FisServiceImpl implements FisService {

    @Autowired
    FisDao fisDao;

    @Override
    @Transactional
    public void addFis(DeptFis deptFis) {
        fisDao.addFis(deptFis);
    }

    @Override
    @Transactional
    public void updateFis(DeptFis deptFis) {
        fisDao.updateFis(deptFis);
    }

    @Override
    @Transactional
    public List<DeptFis> listFis() {
        return fisDao.listFis();
    }

    @Override
    @Transactional
    public DeptFis getFisById(Integer fisId) {
        return fisDao.getFisById(fisId);
    }

    @Override
    @Transactional
    public void removeFis(Integer fisId) {
        fisDao.removeFis(fisId);
    }

}
