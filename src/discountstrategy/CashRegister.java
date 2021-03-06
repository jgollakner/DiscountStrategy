package discountstrategy;

/**
 *
 * @author jlombardo
 */
public class CashRegister {
    private Receipt receipt;

    public Receipt getReceipt() {
        return receipt;
    }
    

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    
     public void startNewSale(String customerId) {
        receipt = new Receipt(customerId);
    }
    public void purchaseProduct(String productId, double qty) {
        receipt.addNewLineItem(productId, qty);
    }
    
    public void finalizeAndDisplaySalesReceipt() {
        System.out.println(receipt.getReceiptInfo());
    }
}
