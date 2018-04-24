/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptSOC.Dao;

import atif.aslam.deptSOC.Model.DeptSoc;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface SocDao {
      public void addSoc(DeptSoc deptSoc);

    public void updateSoc(DeptSoc deptSoc);

    public List<DeptSoc> listSoc();
    

    public DeptSoc getSocById(Integer socId);

    public void removeSoc(Integer socId);
}
