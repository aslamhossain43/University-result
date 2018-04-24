/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFIN.Dao;

import atif.aslam.deptFIN.Model.DeptFin;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface FinDao {
      public void addFin(DeptFin deptFin);

    public void updateFin(DeptFin deptFin);

    public List<DeptFin> listFin();

    public DeptFin getFinById(Integer finId);

    public void removeFin(Integer finId);
}
