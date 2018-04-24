/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptECE.Dao;

import atif.aslam.deptECE.Model.DeptEce;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface EceDao {
     public void addEce(DeptEce deptEce);

    public void updateEce(DeptEce deptEce);

    public List<DeptEce> listEce();

    public DeptEce getEceById(Integer eceId);

    public void removeEce(Integer eceId);
}
