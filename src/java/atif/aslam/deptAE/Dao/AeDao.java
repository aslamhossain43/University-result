/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAE.Dao;

import atif.aslam.deptAE.Model.DeptAe;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface AeDao {
     public void addAe(DeptAe deptAe);

    public void updateAe(DeptAe deptAe);

    public List<DeptAe> listAe();

    public DeptAe getAeById(Integer aeId);

    public void removeAe(Integer aeId);
}
