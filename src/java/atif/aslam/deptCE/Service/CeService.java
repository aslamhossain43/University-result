/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptCE.Service;

import atif.aslam.deptCE.Model.DeptCe;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface CeService {
      public void addCe(DeptCe deptCe);

    public void updateCe(DeptCe deptCe);

    public List<DeptCe> listCe();

    public DeptCe getCeById(Integer ceId);

    public void removeCe(Integer ceId);
}
