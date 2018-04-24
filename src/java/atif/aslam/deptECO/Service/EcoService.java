/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptECO.Service;

import atif.aslam.deptECO.Model.DeptEco;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface EcoService {
     public void addEco(DeptEco deptEco);

    public void updateEco(DeptEco deptEco);

    public List<DeptEco> listEco();

    public DeptEco getEcoById(Integer ecoId);

    public void removeEco(Integer ecoId);
}
