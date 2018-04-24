/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFPE.Dao;

import atif.aslam.deptFPE.Model.DeptFpe;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface FpeDao {
    public void addFpe(DeptFpe deptFpe);

    public void updateFpe(DeptFpe deptFpe);

    public List<DeptFpe> listFpe();

    public DeptFpe getFpeById(Integer fpeId);

    public void removeFpe(Integer fpeId);
}
