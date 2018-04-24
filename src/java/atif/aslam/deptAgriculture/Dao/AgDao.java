/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atif.aslam.deptAgriculture.Dao;

import atif.aslam.deptAgriculture.Model.Deptag;
import java.util.List;

/**
 *
 * @author Atif Aslam
 */
public interface AgDao {
     public void addAg(Deptag deptag);

    public void updateAg(Deptag deptag);

    public List<Deptag> listAg();

    public Deptag getAgById(Integer agId);

    public void removeAg(Integer agId);
}
