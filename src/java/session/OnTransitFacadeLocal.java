/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import java.util.List;
import javax.ejb.Local;
import model.OnTransit;

/**
 *
 * @author snw
 */
@Local
public interface OnTransitFacadeLocal {

	void create(OnTransit onTransit);

	void edit(OnTransit onTransit);

	void remove(OnTransit onTransit);

	OnTransit find(Object id);

	List<OnTransit> findAll();

	List<OnTransit> findRange(int[] range);

	int count();
	
}
