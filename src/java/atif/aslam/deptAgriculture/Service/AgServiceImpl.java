/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAgriculture.Service;

import atif.aslam.deptAgriculture.Dao.AgDao;
import atif.aslam.deptAgriculture.Model.Deptag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class AgServiceImpl implements AgService {

    @Autowired
    AgDao agDao;
 

    @Override
    @Transactional
    public void addAg(Deptag deptag) {
        agDao.addAg(deptag);
    }

    @Override
    @Transactional
    public void updateAg(Deptag deptag) {
        agDao.updateAg(deptag);
    }

    @Override
    @Transactional
    public List<Deptag> listAg() {
        return agDao.listAg();
    }

    @Override
    @Transactional
    public Deptag getAgById(Integer agId) {
        return agDao.getAgById(agId);
    }

    @Override
    @Transactional
    public void removeAg(Integer agId) {
        agDao.removeAg(agId);

    }

}
