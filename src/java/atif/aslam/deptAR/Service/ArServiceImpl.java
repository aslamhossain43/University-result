/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAR.Service;

import atif.aslam.deptAR.Dao.ArDao;
import atif.aslam.deptAR.Model.DeptAr;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class ArServiceImpl implements ArService {

    @Autowired
    ArDao arDao;

    @Override
    @Transactional
    public void addAr(DeptAr deptAr) {
        arDao.addAr(deptAr);
    }

    @Override
    @Transactional
    public void updateAr(DeptAr deptAr) {
        arDao.updateAr(deptAr);
    }

    @Override
    @Transactional
    public List<DeptAr> listAr() {
        return arDao.listAr();
    }

    @Override
    @Transactional
    public DeptAr getArById(Integer arId) {
        return arDao.getArById(arId);
    }

    @Override
    @Transactional
    public void removeAr(Integer arId) {
      arDao.removeAr(arId);
    }


}
