/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptDVM.Service;

import atif.aslam.deptDVM.Dao.DvmDao;
import atif.aslam.deptDVM.Model.DeptDvm;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Atif Aslam
 */
@Service
public class DvmServiceImpl implements DvmService {

    @Autowired
    DvmDao dvmDao;

    @Override
    @Transactional
    public void addDvm(DeptDvm deptDvm) {
dvmDao.addDvm(deptDvm);
    }

    @Override
    @Transactional
    public void updateDvm(DeptDvm deptDvm) {
 dvmDao.updateDvm(deptDvm);
    }

    @Override
    @Transactional
    public List<DeptDvm> listDvm() {
 return dvmDao.listDvm();
    }

    @Override
    @Transactional
    public DeptDvm getDvmById(Integer dvmId) {
return dvmDao.getDvmById(dvmId);
    }

    @Override
    @Transactional
    public void removeDvm(Integer dvmId) {
 dvmDao.removeDvm(dvmId);
    }

}
