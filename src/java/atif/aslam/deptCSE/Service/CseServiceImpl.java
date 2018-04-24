/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCSE.Service;

import atif.aslam.deptCSE.Dao.CseDao;
import atif.aslam.deptCSE.Model.DeptCse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class CseServiceImpl implements CseService {

    @Autowired
    CseDao cseDao;

    @Override
    @Transactional
    public void addCse(DeptCse deptCse) {
        cseDao.addCse(deptCse);

    }

    @Override
    @Transactional
    public void updateCse(DeptCse deptCse) {
        cseDao.updateCse(deptCse);
    }

    @Override
    @Transactional
    public List<DeptCse> listCse() {
        return cseDao.listCse();
    }

    @Override
    @Transactional
    public DeptCse getCseById(Integer cseId) {
        return cseDao.getCseById(cseId);

    }

    @Override
    @Transactional
    public void removeCse(Integer cseId) {
        cseDao.removeCse(cseId);

    }

}
