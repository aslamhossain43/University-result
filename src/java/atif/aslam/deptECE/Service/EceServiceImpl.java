/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptECE.Service;

import atif.aslam.deptECE.Dao.EceDao;
import atif.aslam.deptECE.Model.DeptEce;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class EceServiceImpl implements EceService{
@Autowired
EceDao eceDao;
    @Override
    @Transactional
    public void addEce(DeptEce deptEce) {
eceDao.addEce(deptEce);
    }

    @Override
      @Transactional
    public void updateEce(DeptEce deptEce) {
 eceDao.updateEce(deptEce);
    }

    @Override
      @Transactional
    public List<DeptEce> listEce() {
 return eceDao.listEce();
    }

    @Override
      @Transactional
    public DeptEce getEceById(Integer eceId) {
return eceDao.getEceById(eceId);
    }

    @Override
      @Transactional
    public void removeEce(Integer eceId) {
 eceDao.removeEce(eceId);
    }
    
}
