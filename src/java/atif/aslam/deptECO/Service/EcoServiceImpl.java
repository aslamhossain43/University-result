/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptECO.Service;

import atif.aslam.deptECO.Dao.EcoDao;
import atif.aslam.deptECO.Model.DeptEco;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class EcoServiceImpl implements EcoService{
@Autowired
EcoDao ecoDao;
    @Override
      @Transactional
    public void addEco(DeptEco deptEco) {
ecoDao.addEco(deptEco);
    }

    @Override
      @Transactional
    public void updateEco(DeptEco deptEco) {
ecoDao.updateEco(deptEco);
    }

    @Override
      @Transactional
    public List<DeptEco> listEco() {
 return ecoDao.listEco();
    }

    @Override
      @Transactional
    public DeptEco getEcoById(Integer ecoId) {
return ecoDao.getEcoById(ecoId);
    }

    @Override
      @Transactional
    public void removeEco(Integer ecoId) {
 ecoDao.removeEco(ecoId);
    }
    
}
