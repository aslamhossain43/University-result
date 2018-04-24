/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFIN.Service;

import atif.aslam.deptFIN.Model.DeptFin;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */

public interface FinService {
     public void addFin(DeptFin deptFin);

    public void updateFin(DeptFin deptFin);

    public List<DeptFin> listFin();

    public DeptFin getFinById(Integer finId);

    public void removeFin(Integer finId);
}
