public class Order {
    int orderId;
    int customerId;
    String customerName;
    String deliveryAddress;
    int totalPrice;

    public Order(int Orderid,int CustomerId,String CustomerName,String DeliveryAddress,int totalPrice){
        this.orderId = Orderid;
        this.customerId = CustomerId;
        this.customerName = CustomerName;
        this.deliveryAddress = DeliveryAddress;
        this.totalPrice = totalPrice;
    }

    public void display(){
        System.out.println(
            "OrderID: "+orderId +", "+
            "\sCustomerID: "+customerId+", "+
            "\sCustomerName: "+customerName+", "+
            "\sDeliveryAddress: "+deliveryAddress+", "+
            "\sTotalPrice: "+totalPrice
        );
    }
}
