/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptPHY.Service;

import atif.aslam.deptPHY.Dao.PhyDao;
import atif.aslam.deptPHY.Model.DeptPhy;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class PhyServiceImpl implements PhyService {

    @Autowired
    PhyDao phyDao;

    @Override
    @Transactional
    public void addPhy(DeptPhy deptPhy) {
        phyDao.addPhy(deptPhy);
    }

    @Override
    @Transactional
    public void updatePhy(DeptPhy deptPhy) {
        phyDao.updatePhy(deptPhy);
    }

    @Override
    @Transactional
    public List<DeptPhy> listPhy() {
        return phyDao.listPhy();
    }

    @Override
    @Transactional
    public DeptPhy getPhyById(Integer phyId) {
        return phyDao.getPhyById(phyId);
    }

    @Override
    @Transactional
    public void removePhy(Integer phyId) {
        phyDao.removePhy(phyId);
    }

}
