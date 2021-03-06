
package manufacture.mipod;

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
@WebService(name = "ManufactureWS_MiPod", targetNamespace = "http://manufacture/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ManufactureWSMiPod {


    /**
     * 
     * @return
     *     returns manufacture.mipod.MiPod
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "inquiry", targetNamespace = "http://manufacture/", className = "manufacture.mipod.Inquiry")
    @ResponseWrapper(localName = "inquiryResponse", targetNamespace = "http://manufacture/", className = "manufacture.mipod.InquiryResponse")
    @Action(input = "http://manufacture/ManufactureWS_MiPod/inquiryRequest", output = "http://manufacture/ManufactureWS_MiPod/inquiryResponse")
    public MiPod inquiry();

    /**
     * 
     * @param wareHouseName
     * @return
     *     returns manufacture.mipod.Orders
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPurchaseLog", targetNamespace = "http://manufacture/", className = "manufacture.mipod.GetPurchaseLog")
    @ResponseWrapper(localName = "getPurchaseLogResponse", targetNamespace = "http://manufacture/", className = "manufacture.mipod.GetPurchaseLogResponse")
    @Action(input = "http://manufacture/ManufactureWS_MiPod/getPurchaseLogRequest", output = "http://manufacture/ManufactureWS_MiPod/getPurchaseLogResponse")
    public Orders getPurchaseLog(
        @WebParam(name = "wareHouseName", targetNamespace = "")
        String wareHouseName);

    /**
     * 
     * @param wareHouseName
     * @param quantity
     * @return
     *     returns manufacture.mipod.Order
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shipToWarehouse", targetNamespace = "http://manufacture/", className = "manufacture.mipod.ShipToWarehouse")
    @ResponseWrapper(localName = "shipToWarehouseResponse", targetNamespace = "http://manufacture/", className = "manufacture.mipod.ShipToWarehouseResponse")
    @Action(input = "http://manufacture/ManufactureWS_MiPod/shipToWarehouseRequest", output = "http://manufacture/ManufactureWS_MiPod/shipToWarehouseResponse")
    public Order shipToWarehouse(
        @WebParam(name = "wareHouseName", targetNamespace = "")
        String wareHouseName,
        @WebParam(name = "quantity", targetNamespace = "")
        Integer quantity);

    /**
     * 
     * @return
     *     returns manufacture.mipod.Manufacture
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "manufactureInfo", targetNamespace = "http://manufacture/", className = "manufacture.mipod.ManufactureInfo")
    @ResponseWrapper(localName = "manufactureInfoResponse", targetNamespace = "http://manufacture/", className = "manufacture.mipod.ManufactureInfoResponse")
    @Action(input = "http://manufacture/ManufactureWS_MiPod/manufactureInfoRequest", output = "http://manufacture/ManufactureWS_MiPod/manufactureInfoResponse")
    public Manufacture manufactureInfo();

    /**
     * 
     * @param wareHouseName
     * @param customerRef
     * @return
     *     returns manufacture.mipod.Order
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "payOrder", targetNamespace = "http://manufacture/", className = "manufacture.mipod.PayOrder")
    @ResponseWrapper(localName = "payOrderResponse", targetNamespace = "http://manufacture/", className = "manufacture.mipod.PayOrderResponse")
    @Action(input = "http://manufacture/ManufactureWS_MiPod/payOrderRequest", output = "http://manufacture/ManufactureWS_MiPod/payOrderResponse")
    public Order payOrder(
        @WebParam(name = "wareHouseName", targetNamespace = "")
        String wareHouseName,
        @WebParam(name = "customerRef", targetNamespace = "")
        String customerRef);

}
