/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayarUktApp.dao;

import bayarUktApp.model.ukt_model;
import java.util.List;

/**
 *
 * @author Andi
 */
public interface ukt_int {
    public void insert(ukt_model t);
    public void update(int index, ukt_model t);
    public void delete(int index);
    public ukt_model getUKTRecord(int index);
    public List<ukt_model> getData();
}
