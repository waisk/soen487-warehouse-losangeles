/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.OnTransit;

/**
 *
 * @author snw
 */
@Stateless
public class OnTransitFacade extends AbstractFacade<OnTransit> implements OnTransitFacadeLocal {
	@PersistenceContext(unitName = "soen487-warehouse-pu")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public OnTransitFacade() {
		super(OnTransit.class);
	}
	
}
