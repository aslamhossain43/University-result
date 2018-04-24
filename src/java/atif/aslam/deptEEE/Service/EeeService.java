/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptEEE.Service;

import atif.aslam.deptEEE.Model.DeptEee;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface EeeService {

    public void addEee(DeptEee deptEee);

    public void updateEee(DeptEee deptEee);

    public List<DeptEee> listEee();

    public DeptEee getEeeById(Integer eeeId);

    public void removeEee(Integer eeeId);
}
