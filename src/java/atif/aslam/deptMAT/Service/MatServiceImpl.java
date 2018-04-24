/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAT.Service;

import atif.aslam.deptMAT.Dao.MatDao;
import atif.aslam.deptMAT.Model.DeptMat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class MatServiceImpl implements MatService {

    @Autowired
    MatDao matDao;

    @Override
    @Transactional
    public void addMat(DeptMat deptMat) {
        matDao.addMat(deptMat);
    }

    @Override
    @Transactional
    public void updateMat(DeptMat deptMat) {
        matDao.updateMat(deptMat);
    }

    @Override
    @Transactional
    public List<DeptMat> listMat() {

        return matDao.listMat();
    }

    @Override
    @Transactional
    public DeptMat getMatById(Integer matId) {

        return matDao.getMatById(matId);
    }

    @Override
    @Transactional
    public void removeMat(Integer matId) {
        matDao.removeMat(matId);
    }

}
