package discountstrategy;
import java.text.NumberFormat;
/**
 *
 * @author jlombardo
 */
public class Receipt {
    private Customer customer;
    private LineItem[] lineItems;

    Customer[] customerArray = {
        new Customer("Joe Gollakner", "JG101"), 
        new Customer("John Doe", "JD202"), 
        new Customer("Jane Smith", "JS303")
    };
//    
//    Customer customer1 = new Customer("Joe Gollakner", "JG101");
//    Customer customer2 = new Customer("John Doe", "JD202");
//    Customer customer3 = new Customer("Jane Smith", "JS303");
//    
//    public Receipt(){
//        
//    }
    
    public Receipt(String customerId){
        lineItems = new LineItem[0];
        customer = findCustomerById(customerId);
        
    }
    
        
    private Customer findCustomerById(String id) {
        Customer cust = null;
        
        for(Customer c : customerArray) {
            if(id.equals(c.getId())) {
                cust = c;
                break;
            }
        }
        return cust;
    }

    
    public void addNewLineItem(String productId, double qty) {
        LineItem lineItem = new LineItem(productId, qty);
        // add lineItem to array
        addItem(lineItem);
        
//        for (LineItem lineItem1 : lineItems) {
//            System.out.println(lineItem1);            
//        }
    }

    
    public void addItem(LineItem item) {
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length-1] = item;
        lineItems = temp;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public String getReceiptInfo() {
        double grandTotalPaid = 0;
        double grandTotalDiscount = 0;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        // Start receipt with customer info
        String info = "Cutomer ID: " + this.customer.getId() + "\n"
                + "Customer Name: " + customer.getName() + "\n\n";
        
        // continue with line item info
        info += "ID      Name     Qty    Price   Discount        SubTotal";
        info += "\n================================================================\n";
        
        for(LineItem item : lineItems) {
            grandTotalPaid += item.getSubTotal();
            grandTotalDiscount += item.getDiscountAmt();
            info += item.getLineItemData() + "\n";
        }
        
        info += "\nTotal amount spent: ";
        info += nf.format(grandTotalPaid);
        info += "\nTotal discounts received: ";
        info += nf.format(grandTotalDiscount);
        
                
        //System.out.println("The Grand total comes to $" + grandTotalPaid);
        //System.out.println("The total discount was $" + grandTotalDiscount);
        /// print grand totals
        
        return info;
    }
    
}
