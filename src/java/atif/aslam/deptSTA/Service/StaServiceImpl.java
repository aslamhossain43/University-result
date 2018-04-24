/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptSTA.Service;

import atif.aslam.deptSTA.Dao.StaDao;
import atif.aslam.deptSTA.Model.DeptSta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class StaServiceImpl implements StaService{
 @Autowired
    StaDao staDao;
    @Override
      @Transactional
    public void addSta(DeptSta deptSta) {
staDao.addSta(deptSta);
    }

    @Override
      @Transactional
    public void updateSta(DeptSta deptSta) {
  staDao.updateSta(deptSta);
    }

    @Override
      @Transactional
    public List<DeptSta> listSta() {
return staDao.listSta();
    }

    @Override
      @Transactional
    public DeptSta getStaById(Integer staId) {
    return staDao.getStaById(staId);
    }

    @Override
      @Transactional
    public void removeSta(Integer staId) {
 staDao.removeSta(staId);

    }
    
}
