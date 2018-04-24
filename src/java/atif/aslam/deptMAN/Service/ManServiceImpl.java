/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAN.Service;

import atif.aslam.deptMAN.Dao.ManDao;
import atif.aslam.deptMAN.Model.DeptMan;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class ManServiceImpl implements ManService{
 @Autowired
    ManDao manDao;

    @Override
       @Transactional
    public void addMan(DeptMan deptMan) {
 manDao.addMan(deptMan);
    }

    @Override
       @Transactional
    public void updateMan(DeptMan deptMan) {
 manDao.updateMan(deptMan);
    }

    @Override
       @Transactional
    public List<DeptMan> listMan() {
  return manDao.listMan();
    }

    @Override
       @Transactional
    public DeptMan getManById(Integer manId) {
     return manDao.getManById(manId);
    }

    @Override
       @Transactional
    public void removeMan(Integer manId) {
   manDao.removeMan(manId);
    }
    
}
