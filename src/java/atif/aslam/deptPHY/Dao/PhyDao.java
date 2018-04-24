/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptPHY.Dao;

import atif.aslam.deptPHY.Model.DeptPhy;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface PhyDao {
     public void addPhy(DeptPhy deptPhy);

    public void updatePhy(DeptPhy deptPhy);

    public List<DeptPhy> listPhy();
    

    public DeptPhy getPhyById(Integer phyId);

    public void removePhy(Integer phyId);
}
