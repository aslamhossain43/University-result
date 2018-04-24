/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCSE.Service;

import atif.aslam.deptCSE.Model.DeptCse;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface CseService {
     public void addCse(DeptCse deptCse);

    public void updateCse(DeptCse deptCse);

    public List<DeptCse> listCse();

    public DeptCse getCseById(Integer cseId);

    public void removeCse(Integer cseId);
}
