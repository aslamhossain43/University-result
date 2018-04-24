/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptSOC.Service;

import atif.aslam.deptSOC.Dao.SocDao;
import atif.aslam.deptSOC.Model.DeptSoc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class SocServiceImpl implements SocService {

    @Autowired
    SocDao socDao;

    @Override
    @Transactional
    public void addSoc(DeptSoc deptSoc) {

        socDao.addSoc(deptSoc);
    }

    @Override
    @Transactional
    public void updateSoc(DeptSoc deptSoc) {
        socDao.updateSoc(deptSoc);
    }

    @Override
    @Transactional
    public List<DeptSoc> listSoc() {
        return socDao.listSoc();
    }

    @Override
    @Transactional
    public DeptSoc getSocById(Integer socId) {
        return socDao.getSocById(socId);
    }

    @Override
    @Transactional
    public void removeSoc(Integer socId) {
        socDao.removeSoc(socId);
    }

}
