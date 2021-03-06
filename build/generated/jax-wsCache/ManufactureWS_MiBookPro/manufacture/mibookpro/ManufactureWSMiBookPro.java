
package manufacture.mibookpro;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ManufactureWS_MiBookPro", targetNamespace = "http://manufacture/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ManufactureWSMiBookPro {


    /**
     * 
     * @return
     *     returns manufacture.mibookpro.MiBookPro
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "inquiry", targetNamespace = "http://manufacture/", className = "manufacture.mibookpro.Inquiry")
    @ResponseWrapper(localName = "inquiryResponse", targetNamespace = "http://manufacture/", className = "manufacture.mibookpro.InquiryResponse")
    @Action(input = "http://manufacture/ManufactureWS_MiBookPro/inquiryRequest", output = "http://manufacture/ManufactureWS_MiBookPro/inquiryResponse")
    public MiBookPro inquiry();

    /**
     * 
     * @param wareHouseName
     * @return
     *     returns manufacture.mibookpro.Orders
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPurchaseLog", targetNamespace = "http://manufacture/", className = "manufacture.mibookpro.GetPurchaseLog")
    @ResponseWrapper(localName = "getPurchaseLogResponse", targetNamespace = "http://manufacture/", className = "manufacture.mibookpro.GetPurchaseLogResponse")
    @Action(input = "http://manufacture/ManufactureWS_MiBookPro/getPurchaseLogRequest", output = "http://manufacture/ManufactureWS_MiBookPro/getPurchaseLogResponse")
    public Orders getPurchaseLog(
        @WebParam(name = "wareHouseName", targetNamespace = "")
        String wareHouseName);

    /**
     * 
     * @param wareHouseName
     * @param quantity
     * @return
     *     returns manufacture.mibookpro.Order
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shipToWarehouse", targetNamespace = "http://manufacture/", className = "manufacture.mibookpro.ShipToWarehouse")
    @ResponseWrapper(localName = "shipToWarehouseResponse", targetNamespace = "http://manufacture/", className = "manufacture.mibookpro.ShipToWarehouseResponse")
    @Action(input = "http://manufacture/ManufactureWS_MiBookPro/shipToWarehouseRequest", output = "http://manufacture/ManufactureWS_MiBookPro/shipToWarehouseResponse")
    public Order shipToWarehouse(
        @WebParam(name = "wareHouseName", targetNamespace = "")
        String wareHouseName,
        @WebParam(name = "quantity", targetNamespace = "")
        Integer quantity);

    /**
     * 
     * @param wareHouseName
     * @param customerRef
     * @return
     *     returns manufacture.mibookpro.Order
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "payOrder", targetNamespace = "http://manufacture/", className = "manufacture.mibookpro.PayOrder")
    @ResponseWrapper(localName = "payOrderResponse", targetNamespace = "http://manufacture/", className = "manufacture.mibookpro.PayOrderResponse")
    @Action(input = "http://manufacture/ManufactureWS_MiBookPro/payOrderRequest", output = "http://manufacture/ManufactureWS_MiBookPro/payOrderResponse")
    public Order payOrder(
        @WebParam(name = "wareHouseName", targetNamespace = "")
        String wareHouseName,
        @WebParam(name = "customerRef", targetNamespace = "")
        String customerRef);

    /**
     * 
     * @return
     *     returns manufacture.mibookpro.Manufacture
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "manufactureInfo", targetNamespace = "http://manufacture/", className = "manufacture.mibookpro.ManufactureInfo")
    @ResponseWrapper(localName = "manufactureInfoResponse", targetNamespace = "http://manufacture/", className = "manufacture.mibookpro.ManufactureInfoResponse")
    @Action(input = "http://manufacture/ManufactureWS_MiBookPro/manufactureInfoRequest", output = "http://manufacture/ManufactureWS_MiBookPro/manufactureInfoResponse")
    public Manufacture manufactureInfo();

}
