/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptME.Service;

import atif.aslam.deptME.Model.DeptMe;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface MeService {
      public void addMe(DeptMe deptMe);

    public void updateMe(DeptMe deptMe);

    public List<DeptMe> listMe();

    public DeptMe getMeById(Integer meId);

    public void removeMe(Integer meId);
}
