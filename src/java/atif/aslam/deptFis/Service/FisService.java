/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptFis.Service;

import atif.aslam.deptFis.Model.DeptFis;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface FisService {
     public void addFis(DeptFis deptFis);

    public void updateFis(DeptFis deptFis);

    public List<DeptFis> listFis();

    public DeptFis getFisById(Integer fisId);

    public void removeFis(Integer fisId);
}
