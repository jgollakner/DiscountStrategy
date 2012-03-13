package discountstrategy;

/**
 *
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        
        cr.startNewSale("JG101");
        cr.purchaseProduct("A101", 2);
        cr.purchaseProduct("B101", 9);
        cr.purchaseProduct("C101", 5);
        
        
//       
        cr.finalizeAndDisplaySalesReceipt();
        
    }
}
