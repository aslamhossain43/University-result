/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptME.Service;

import atif.aslam.deptME.Dao.MeDao;
import atif.aslam.deptME.Model.DeptMe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class MeServiceImpl implements MeService {

    @Autowired
    MeDao meDao;

    @Override
    @Transactional
    public void addMe(DeptMe deptMe) {
        meDao.addMe(deptMe);
    }

    @Override
    @Transactional
    public void updateMe(DeptMe deptMe) {
        meDao.updateMe(deptMe);
    }

    @Override
    @Transactional
    public List<DeptMe> listMe() {
        return meDao.listMe();
    }

    @Override
    @Transactional
    public DeptMe getMeById(Integer meId) {
        return meDao.getMeById(meId);
    }

    @Override
    @Transactional
    public void removeMe(Integer meId) {
        meDao.removeMe(meId);
    }

}
