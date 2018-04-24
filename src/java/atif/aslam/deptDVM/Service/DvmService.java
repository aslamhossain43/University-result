/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptDVM.Service;

import atif.aslam.deptDVM.Model.DeptDvm;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface DvmService {
     public void addDvm(DeptDvm deptDvm);

    public void updateDvm(DeptDvm deptDvm);

    public List<DeptDvm> listDvm();

    public DeptDvm getDvmById(Integer dvmId);

    public void removeDvm(Integer dvmId);
}
