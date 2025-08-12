import java.util.ArrayList;

public class MovieRentalSystem {

    //Creacion de la "base de datos " que almacenara las peliculas y los clientes
    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    //creacion de metodo addItem
    public void addItem(Movie newItem) {
        int id = newItem.getItemId();

        for (Movie item: movies) {
            if (item.getItemId() == id) {
                System.out.println("La pelicula ya se encuentra registrada");
                return;
            }
        }
        movies.add(newItem);
    }

    //Creacion metodo registerCustomer
    public void registerCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }

    //Creacion metodo returnMovie
        public void returnMovie(int itemId, String userId){
        Movie item = getItem(itemId);
        Customer customer = getUser(userId);

        if (customer == null || item == null) {
            System.out.println("Cliente o Pelicula no existe");
            return;
        }

        item.setAvailable(false);
        System.out.println("La pelicula ha sido devuelta con extio");

    }

    //Creacion metodo rentMovieCustomer
    public void rentMovieCustomer(int itemId, String userId) {

        Movie item = getItem(itemId);
        Customer customer = getUser(userId);

        if (customer == null || item == null) {
            System.out.println("Cliente o Pelicula no existe");
            return;
        }

        // validar disponibilidad del item
        if (item.available) {
            System.out.println("La pelicula no se encuentra disponible");
            return;
        }

        // operacion de prestamo
        customer.getRentedMovies().add(item);
        item.setAvailable(true);
        System.out.println("La pelicula se presto de manera satisfactoria");
    }

    public void showAllItems(){
        System.out.println("******************************************");
        System.out.println("");
        System.out.println("DETALLE DE PELICULAS");
        System.out.println("*******************************************");
        System.out.println("");
        for (Movie item: movies){
            item.showDetails();
            System.out.println("---------------------------------------------------");
        }
        System.out.println("********************************************");
    }
    // metodo que imprime la informacion de los items
    // true: imprime todos los items (disponibles/no disponibles)
    // false: imprime solo los items disponibles
    public void showItemsAvailabe(boolean condicion) {
        if (condicion) {
            for (Movie item: movies) {
                item.showDetails();
                System.out.println("++++++++++++++++++++++++++++++++++");
            }
        } else {
            for (Movie item: movies) {
                if (!item.isAvailable()) {
                    item.showDetails();
                    System.out.println("++++++++++++++++++++++++++++++++++");
                }
            }
        }
    }


    public void showAllCustomers( ) {
        System.out.println("******************************************");
        System.out.println("");
        System.out.println("DETALLE DE CLIENTES");
        System.out.println("*******************************************");
        System.out.println("");
        for (Customer item: customers){
            item.showCustomerDetails();
            System.out.println("---------------------------------------------------");
        }
        System.out.println("********************************************");
    }





    // metodo para obtener un item por su id
    // itera sobre el array de items y en caso haya una coincidencia con el id proporcionado
    // retorna el item, caso contrario retorna null
    private Movie getItem(int itemId) {
        for (Movie item: movies) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }

    // metodo para obtener un usuario por su id
    // itera sobre el array de users y en caso haya una coincidencia con el id proporcionado
    // retorna el usuario, caso contrario retorna null
    private Customer getUser(String userId) {
        for (Customer customer: customers) {
            if (customer.getCustomerId().equals(userId)) {
                return customer;
            }
        }
        return null;
    }

}
