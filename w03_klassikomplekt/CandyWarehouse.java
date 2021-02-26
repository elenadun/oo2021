public class CandyWarehouse{ // klass kommiladu
    int warehouseAmount;
    Shop shopAmount;

        // konstruktor (Eksemplariväljade väärtused määratakse konstruktori meetodis)
        public CandyWarehouse(int nAmount, Shop nShopAmount){
            warehouseAmount = nAmount;
            shopAmount = nShopAmount;
        }

        public int askWarehouseAmount(){ //public method askWarehouseAmount
            return warehouseAmount;
        }

        public boolean goShopping(){ // kontrollib, kas poodi on vaja kommi (public method)
            if(shopAmount.askShopAmount() > 0){
                return false;
            } else {
                return true;
            }
        }
    
}