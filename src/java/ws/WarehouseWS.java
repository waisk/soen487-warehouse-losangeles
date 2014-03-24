/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import java.math.BigInteger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.ws.WebServiceRef;
import manufacture.mibookair.ManufactureWS;
import manufacture.mibookair.MiBookAir;
import manufacture.mibookair.Order;
import model.OnTransit;
import model.Warehouse;

/**
 *
 * @author waisk
 */
@WebService(serviceName = "WarehouseWS")
@Stateless()
public class WarehouseWS {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/54.186.189.163_8080/ManufactureWS/ManufactureWS_MiBookPro.wsdl")
    private manufacture.mibookpro.ManufactureWS service_5;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/54.186.198.75_8080/ManufactureWS/ManufactureWS_MiBook.wsdl")
    private manufacture.mibook.ManufactureWS service_4;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/54.186.105.181_8080/ManufactureWS/ManufactureWS_MiPhone.wsdl")
    private manufacture.miphone.ManufactureWS service_3;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/54.186.105.181_8080/ManufactureWS/ManufactureWS_MiPod.wsdl")
    private manufacture.mipod.ManufactureWS service_2;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/54.186.176.247_8080/ManufactureWS/ManufactureWS_MiBookAir.wsdl")
    private ManufactureWS service;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/54.186.176.247_8080/ManufactureWS/ManufactureWS_MiPad.wsdl")
    private manufacture.mipad.ManufactureWS service_1;
    
    @PersistenceContext(unitName = "soen487-warehouse-pu")
    private EntityManager em;
     public void persist(Object object) {
        em.persist(object);
    }

    
    private Warehouse wh = Warehouse.getInstance();
   

    /**
     * Web service operation
     */
    @WebMethod(operationName = "shipGood")
    public Integer shipGood(@WebParam(name = "type") final String type, @WebParam(name = "amount") final Integer amount) {
        //TODO write your implementation code here:
        //get quanity of the item first
        String typeName = type.toLowerCase();
        int quantity = wh.getInventory().get(typeName);
        if(quantity >= amount)
        {
            System.out.println("Inventory is " + wh.getInventory());
            wh.getInventory().put(typeName, quantity-amount);
            
            return amount;
        }
        else
        {
            Integer amountGoingToReceive = 0;
			if (typeName.equals("miphone"))
			{
				amountGoingToReceive = (orderMiPhone(wh.getName()
								, Warehouse.DEFAULT_SHIP_QUANTITY)).getQuantity();

			}
			else if (typeName.equals("mipad"))
			{
				amountGoingToReceive = (orderMiPad(wh.getName()
								, Warehouse.DEFAULT_SHIP_QUANTITY)).getQuantity();
			}
			else if (typeName.equals("mipod"))
			{
                                amountGoingToReceive = (orderMiPod(wh.getName()
								, Warehouse.DEFAULT_SHIP_QUANTITY)).getQuantity();
			}
			else if (typeName.equals("mibook"))
			{
                                amountGoingToReceive = (orderMiBook(wh.getName()
								, Warehouse.DEFAULT_SHIP_QUANTITY)).getQuantity();
			}
			else if (typeName.equals("mibookpro"))
			{
                                amountGoingToReceive = (orderMiBookPro(wh.getName()
								, Warehouse.DEFAULT_SHIP_QUANTITY)).getQuantity();
			}
			else if (typeName.equals("mibookair"))
			{
				amountGoingToReceive = (orderMiBookAir(wh.getName()
								, Warehouse.DEFAULT_SHIP_QUANTITY)).getQuantity();
			}

			return amountGoingToReceive;
        }
        
    }
    
    private manufacture.mipad.Order orderMiPad(java.lang.String wareHouseName, java.lang.Integer quantity) {
		// Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
		// If the calling of port operations may lead to race condition some synchronization is required.
		manufacture.mipad.ManufactureWSMiPad port = service_1.getManufactureWSMiPadPort();
		return port.shipToWarehouse(wareHouseName, quantity);
	}

    private manufacture.mibookair.Order orderMiBookAir(java.lang.String wareHouseName, java.lang.Integer quantity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
	manufacture.mibookair.ManufactureWSMiBookAir port = service.getManufactureWSMiBookAirPort();
	return port.shipToWarehouse(wareHouseName, quantity);
	}
        
    private manufacture.mipod.Order orderMiPod(java.lang.String wareHouseName, java.lang.Integer quantity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        manufacture.mipod.ManufactureWSMiPod port = service_2.getManufactureWSMiPodPort();
        return port.shipToWarehouse(wareHouseName, quantity);
        }
         
    private manufacture.miphone.Order orderMiPhone(java.lang.String wareHouseName, java.lang.Integer quantity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        manufacture.miphone.ManufactureWSMiPhone port = service_3.getManufactureWSMiPhonePort();
        return port.shipToWarehouse(wareHouseName, quantity);
        }
         
          private manufacture.mibook.Order orderMiBook(java.lang.String wareHouseName, java.lang.Integer quantity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        manufacture.mibook.ManufactureWSMiBook port = service_4.getManufactureWSMiBookPort();
        return port.shipToWarehouse(wareHouseName, quantity);
    }

    private manufacture.mibookpro.Order orderMiBookPro(java.lang.String wareHouseName, java.lang.Integer quantity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        manufacture.mibookpro.ManufactureWSMiBookPro port = service_5.getManufactureWSMiBookProPort();
        return port.shipToWarehouse(wareHouseName, quantity);
    }
   
         
        /**
	 * Web service operation
	 */
	@WebMethod(operationName = "inquiry")
	public String inquiry() {
		return inquiryMiBookAir().toString();
	}


        private MiBookAir inquiryMiBookAir() {
            // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
            // If the calling of port operations may lead to race condition some synchronization is required.
            manufacture.mibookair.ManufactureWSMiBookAir port = service.getManufactureWSMiBookAirPort();
            return port.inquiry();
        }

    

}
