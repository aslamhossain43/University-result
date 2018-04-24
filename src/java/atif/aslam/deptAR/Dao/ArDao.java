/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAR.Dao;

import atif.aslam.deptAR.Model.DeptAr;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface ArDao {
      public void addAr(DeptAr deptAr);

    public void updateAr(DeptAr deptAr);

    public List<DeptAr> listAr();

    public DeptAr getArById(Integer arId);

    public void removeAr(Integer arId);
}
