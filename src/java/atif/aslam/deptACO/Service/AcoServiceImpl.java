/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptACO.Service;

import atif.aslam.deptACO.Dao.AcoDao;
import atif.aslam.deptACO.Model.DeptAco;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class AcoServiceImpl implements AcoService{
@Autowired
    AcoDao acoDao;

    @Override
       @Transactional
    public void addAco(DeptAco deptAco) {
 acoDao.addAco(deptAco);
    }

    @Override
       @Transactional
    public void updateAco(DeptAco deptAco) {
 acoDao.updateAco(deptAco);
    }

    @Override
       @Transactional
    public List<DeptAco> listAco() {
 return acoDao.listAco();
    }

    @Override
       @Transactional
    public DeptAco getAcoById(Integer acoId) {
return acoDao.getAcoById(acoId);
    }

    @Override
       @Transactional
    public void removeAco(Integer acoId) {
 acoDao.removeAco(acoId);
    }
    
}
