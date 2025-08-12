import java.util.ArrayList;

public class Customer {
    //atributos
    private String customerId;
    private String customerName;
    private ArrayList<RentalItem> rentedMovies;

    //constructor
    public Customer(String customerId, String customerName){
        this.customerId = customerId;
        this.customerName = customerName;
        rentedMovies = new ArrayList<>();

    }
    //getters y setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<RentalItem> getRentedMovies() {
        return rentedMovies;
    }

    public void setRentedMovies(ArrayList<RentalItem> rentedMovies) {
        this.rentedMovies = rentedMovies;
    }


    public void showCustomerDetails(){

        System.out.println("DNI: " + customerId);
        System.out.println("Nombre: " + customerName);

    }

}
