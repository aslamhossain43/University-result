/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptACO.Service;

import atif.aslam.deptACO.Model.DeptAco;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface AcoService {
     public void addAco(DeptAco deptAco);

    public void updateAco(DeptAco deptAco);

    public List<DeptAco> listAco();

    public DeptAco getAcoById(Integer acoId);

    public void removeAco(Integer acoId);
}
