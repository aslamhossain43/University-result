/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCE.Service;

import atif.aslam.deptCE.Dao.CeDao;
import atif.aslam.deptCE.Model.DeptCe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class CeServiceImpl implements CeService {

    @Autowired
    CeDao ceDao;

    @Override
    @Transactional
    public void addCe(DeptCe deptCe) {
        ceDao.addCe(deptCe);
    }

    @Override
    @Transactional
    public void updateCe(DeptCe deptCe) {
        ceDao.updateCe(deptCe);
    }

    @Override
    @Transactional
    public List<DeptCe> listCe() {
        return ceDao.listCe();
    }

    @Override
    @Transactional
    public DeptCe getCeById(Integer ceId) {
        return ceDao.getCeById(ceId);
    }

    @Override
    @Transactional
    public void removeCe(Integer ceId) {
        ceDao.removeCe(ceId);
    }

}
