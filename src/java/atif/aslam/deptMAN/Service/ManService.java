/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptMAN.Service;

import atif.aslam.deptMAN.Model.DeptMan;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface ManService {
      public void addMan(DeptMan deptMan);

    public void updateMan(DeptMan deptMan);

    public List<DeptMan> listMan();

    public DeptMan getManById(Integer manId);

    public void removeMan(Integer manId);
}
