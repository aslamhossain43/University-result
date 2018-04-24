/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAE.Service;

import atif.aslam.deptAE.Dao.AeDao;
import atif.aslam.deptAE.Model.DeptAe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class AeServiceImpl implements AeService {

    @Autowired
    AeDao aeDao;

    @Override
    @Transactional
    public void addAe(DeptAe deptAe) {
        aeDao.addAe(deptAe);
    }

    @Override
    @Transactional
    public void updateAe(DeptAe deptAe) {
        aeDao.updateAe(deptAe);
    }

    @Override
    @Transactional
    public List<DeptAe> listAe() {
        return aeDao.listAe();
    }

    @Override
    @Transactional
    public DeptAe getAeById(Integer aeId) {
        return aeDao.getAeById(aeId);
    }

    @Override
    @Transactional
    public void removeAe(Integer aeId) {
        aeDao.removeAe(aeId);
    }

}
