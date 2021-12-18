public class Order {

    private int orderID;
    private double orderAmount;
    private String customerName;
    private String customerID;

    public Order(int orderNum, double orderValue, String custName, String custID){
        this.orderID = orderNum;
        this.orderAmount = orderValue;
        this.customerName = custName;
        this.customerID = custID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString(){
        return "Order Amount: " + this.orderAmount + " Customer Name: " + this.customerName;
    }
}
