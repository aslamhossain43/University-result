/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAR.Service;

import atif.aslam.deptMAR.Dao.MarDao;
import atif.aslam.deptMAR.Model.DeptMar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class MarServiceImpl implements MarService{
     @Autowired
    MarDao marDao;

    @Override
       @Transactional
    public void addMar(DeptMar deptMar) {
 marDao.addMar(deptMar);
    }

    @Override
       @Transactional
    public void updateMar(DeptMar deptMar) {
 marDao.updateMar(deptMar);
    }

    @Override
       @Transactional
    public List<DeptMar> listMar() {
  return marDao.listMar();
    }

    @Override
       @Transactional
    public DeptMar getMarById(Integer marId) {
     return marDao.getMarById(marId);
    }

    @Override
       @Transactional
    public void removeMar(Integer marId) {
   marDao.removeMar(marId);
    }
}
