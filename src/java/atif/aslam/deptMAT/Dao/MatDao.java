/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAT.Dao;

import atif.aslam.deptMAT.Model.DeptMat;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface MatDao {
     public void addMat(DeptMat deptMat);

    public void updateMat(DeptMat deptMat);

    public List<DeptMat> listMat();
    

    public DeptMat getMatById(Integer matId);

    public void removeMat(Integer matId);
}
