/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFPE.Service;

import atif.aslam.deptFPE.Dao.FpeDao;
import atif.aslam.deptFPE.Model.DeptFpe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class FpeServiceImpl implements FpeService {

    @Autowired
    FpeDao fpeDao;

    @Override
    @Transactional
    public void addFpe(DeptFpe deptFpe) {

        fpeDao.addFpe(deptFpe);
    }

    @Override
    @Transactional
    public void updateFpe(DeptFpe deptFpe) {

        fpeDao.updateFpe(deptFpe);
    }

    @Override
    @Transactional
    public List<DeptFpe> listFpe() {
        return fpeDao.listFpe();

    }

    @Override
    @Transactional
    public DeptFpe getFpeById(Integer fpeId) {
        return fpeDao.getFpeById(fpeId);
    }

    @Override
    @Transactional
    public void removeFpe(Integer fpeId) {
        fpeDao.removeFpe(fpeId);
    }

}
