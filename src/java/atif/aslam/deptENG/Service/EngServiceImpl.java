/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptENG.Service;

import atif.aslam.deptENG.Dao.EngDao;
import atif.aslam.deptENG.Model.DeptEng;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class EngServiceImpl implements EngService{

    @Autowired
    EngDao engDao;
    @Override
      @Transactional
    public void addEng(DeptEng deptEng) {
  engDao.addEng(deptEng);
    }

    @Override
      @Transactional
    public void updateEng(DeptEng deptEng) {
 engDao.updateEng(deptEng);
    }

    @Override
      @Transactional
    public List<DeptEng> listEng() {
   return engDao.listEng();
    }

    @Override
      @Transactional
    public DeptEng getEngById(Integer engId) {

 return engDao.getEngById(engId);
    }

    @Override
      @Transactional
    public void removeEng(Integer engId) {
  engDao.removeEng(engId);
    }
    
}
