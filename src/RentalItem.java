public class RentalItem {

    //Declaracion de atributos
    protected int itemId;
    protected String itemName;
    protected boolean available ;

    //creacion constructor
    public  RentalItem(int itemId, String itemName){
        this.itemId = itemId;
        this.itemName = itemName;
        this.available = false;
    }

    //getters and setters

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //creacion metodo para mostrar

    public void showDetails(){
        System.out.println("*************************************************************");
        System.out.println();
        System.out.println("id: " + itemId);
        System.out.println("Nombre: " + itemName );
        System.out.println("Prestado: " + available);

    }
}
