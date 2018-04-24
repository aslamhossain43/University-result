/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCHE.Service;

import atif.aslam.deptCHE.Model.DeptChe;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface CheService {
      public void addChe(DeptChe deptChe);

    public void updateChe(DeptChe deptChe);

    public List<DeptChe> listChe();

    public DeptChe getCheById(Integer cheId);

    public void removeChe(Integer cheId);
}
