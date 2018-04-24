/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptSTA.Dao;

import atif.aslam.deptSTA.Model.DeptSta;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface StaDao {
     public void addSta(DeptSta deptSta);

    public void updateSta(DeptSta deptSta);

    public List<DeptSta> listSta();
    

    public DeptSta getStaById(Integer staId);

    public void removeSta(Integer staId);
}
