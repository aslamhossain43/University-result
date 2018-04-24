/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptENG.Dao;

import atif.aslam.deptENG.Model.DeptEng;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface EngDao {
     public void addEng(DeptEng deptEng);

    public void updateEng(DeptEng deptEng);

    public List<DeptEng> listEng();

    public DeptEng getEngById(Integer engId);

    public void removeEng(Integer engId);
}
