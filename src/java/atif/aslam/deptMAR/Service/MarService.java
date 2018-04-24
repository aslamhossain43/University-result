/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAR.Service;

import atif.aslam.deptMAR.Model.DeptMar;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface MarService {
      public void addMar(DeptMar deptMar);

    public void updateMar(DeptMar deptMar);

    public List<DeptMar> listMar();
    

    public DeptMar getMarById(Integer marId);

    public void removeMar(Integer marId);
}
