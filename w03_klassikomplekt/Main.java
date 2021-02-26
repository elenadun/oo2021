public class Main{ 
    public static void main(String[] arg){ // Main meetod
        
        // koostab uus pood ja uus ladu
        Shop candyShop = new Shop(20); 
        CandyWarehouse candyWarehouse = new CandyWarehouse(50, candyShop); 
        
        System.out.println("Kas poodi on kommi vaja?: " + candyWarehouse.goShopping()); // prindib välja kas poodi on veel kommid vaja

        System.out.println("Kommilaos on " + candyWarehouse.askWarehouseAmount() + " ja kommipoes " + candyShop.askShopAmount() + " kommi"); // prindib välja mitu kommi on laos ja poes

    }

}