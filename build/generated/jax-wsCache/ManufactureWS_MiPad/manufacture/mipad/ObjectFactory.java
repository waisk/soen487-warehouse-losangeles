
package manufacture.mipad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the manufacture.mipad package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MiBookAir_QNAME = new QName("http://manufacture/", "MiBookAir");
    private final static QName _Order_QNAME = new QName("http://manufacture/", "Order");
    private final static QName _GetPurchaseLog_QNAME = new QName("http://manufacture/", "getPurchaseLog");
    private final static QName _InquiryResponse_QNAME = new QName("http://manufacture/", "inquiryResponse");
    private final static QName _ManufactureInfoResponse_QNAME = new QName("http://manufacture/", "manufactureInfoResponse");
    private final static QName _Orders_QNAME = new QName("http://manufacture/", "Orders");
    private final static QName _ShipToWarehouse_QNAME = new QName("http://manufacture/", "shipToWarehouse");
    private final static QName _ShipToWarehouseResponse_QNAME = new QName("http://manufacture/", "shipToWarehouseResponse");
    private final static QName _GetPurchaseLogResponse_QNAME = new QName("http://manufacture/", "getPurchaseLogResponse");
    private final static QName _PayOrder_QNAME = new QName("http://manufacture/", "payOrder");
    private final static QName _PayOrderResponse_QNAME = new QName("http://manufacture/", "payOrderResponse");
    private final static QName _ManufactureInfo_QNAME = new QName("http://manufacture/", "manufactureInfo");
    private final static QName _Inquiry_QNAME = new QName("http://manufacture/", "inquiry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: manufacture.mipad
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManufactureInfo }
     * 
     */
    public ManufactureInfo createManufactureInfo() {
        return new ManufactureInfo();
    }

    /**
     * Create an instance of {@link Inquiry }
     * 
     */
    public Inquiry createInquiry() {
        return new Inquiry();
    }

    /**
     * Create an instance of {@link ShipToWarehouse }
     * 
     */
    public ShipToWarehouse createShipToWarehouse() {
        return new ShipToWarehouse();
    }

    /**
     * Create an instance of {@link ShipToWarehouseResponse }
     * 
     */
    public ShipToWarehouseResponse createShipToWarehouseResponse() {
        return new ShipToWarehouseResponse();
    }

    /**
     * Create an instance of {@link PayOrderResponse }
     * 
     */
    public PayOrderResponse createPayOrderResponse() {
        return new PayOrderResponse();
    }

    /**
     * Create an instance of {@link PayOrder }
     * 
     */
    public PayOrder createPayOrder() {
        return new PayOrder();
    }

    /**
     * Create an instance of {@link GetPurchaseLogResponse }
     * 
     */
    public GetPurchaseLogResponse createGetPurchaseLogResponse() {
        return new GetPurchaseLogResponse();
    }

    /**
     * Create an instance of {@link GetPurchaseLog }
     * 
     */
    public GetPurchaseLog createGetPurchaseLog() {
        return new GetPurchaseLog();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link ManufactureInfoResponse }
     * 
     */
    public ManufactureInfoResponse createManufactureInfoResponse() {
        return new ManufactureInfoResponse();
    }

    /**
     * Create an instance of {@link InquiryResponse }
     * 
     */
    public InquiryResponse createInquiryResponse() {
        return new InquiryResponse();
    }

    /**
     * Create an instance of {@link Orders }
     * 
     */
    public Orders createOrders() {
        return new Orders();
    }

    /**
     * Create an instance of {@link MiPad }
     * 
     */
    public MiPad createMiPad() {
        return new MiPad();
    }

    /**
     * Create an instance of {@link Manufacture }
     * 
     */
    public Manufacture createManufacture() {
        return new Manufacture();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiPad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "MiBookAir")
    public JAXBElement<MiPad> createMiBookAir(MiPad value) {
        return new JAXBElement<MiPad>(_MiBookAir_QNAME, MiPad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "Order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "getPurchaseLog")
    public JAXBElement<GetPurchaseLog> createGetPurchaseLog(GetPurchaseLog value) {
        return new JAXBElement<GetPurchaseLog>(_GetPurchaseLog_QNAME, GetPurchaseLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "inquiryResponse")
    public JAXBElement<InquiryResponse> createInquiryResponse(InquiryResponse value) {
        return new JAXBElement<InquiryResponse>(_InquiryResponse_QNAME, InquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufactureInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "manufactureInfoResponse")
    public JAXBElement<ManufactureInfoResponse> createManufactureInfoResponse(ManufactureInfoResponse value) {
        return new JAXBElement<ManufactureInfoResponse>(_ManufactureInfoResponse_QNAME, ManufactureInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Orders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "Orders")
    public JAXBElement<Orders> createOrders(Orders value) {
        return new JAXBElement<Orders>(_Orders_QNAME, Orders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipToWarehouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "shipToWarehouse")
    public JAXBElement<ShipToWarehouse> createShipToWarehouse(ShipToWarehouse value) {
        return new JAXBElement<ShipToWarehouse>(_ShipToWarehouse_QNAME, ShipToWarehouse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipToWarehouseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "shipToWarehouseResponse")
    public JAXBElement<ShipToWarehouseResponse> createShipToWarehouseResponse(ShipToWarehouseResponse value) {
        return new JAXBElement<ShipToWarehouseResponse>(_ShipToWarehouseResponse_QNAME, ShipToWarehouseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "getPurchaseLogResponse")
    public JAXBElement<GetPurchaseLogResponse> createGetPurchaseLogResponse(GetPurchaseLogResponse value) {
        return new JAXBElement<GetPurchaseLogResponse>(_GetPurchaseLogResponse_QNAME, GetPurchaseLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "payOrder")
    public JAXBElement<PayOrder> createPayOrder(PayOrder value) {
        return new JAXBElement<PayOrder>(_PayOrder_QNAME, PayOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "payOrderResponse")
    public JAXBElement<PayOrderResponse> createPayOrderResponse(PayOrderResponse value) {
        return new JAXBElement<PayOrderResponse>(_PayOrderResponse_QNAME, PayOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufactureInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "manufactureInfo")
    public JAXBElement<ManufactureInfo> createManufactureInfo(ManufactureInfo value) {
        return new JAXBElement<ManufactureInfo>(_ManufactureInfo_QNAME, ManufactureInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inquiry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://manufacture/", name = "inquiry")
    public JAXBElement<Inquiry> createInquiry(Inquiry value) {
        return new JAXBElement<Inquiry>(_Inquiry_QNAME, Inquiry.class, null, value);
    }

}
