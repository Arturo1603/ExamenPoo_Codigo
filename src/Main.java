import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MovieRentalSystem movieRentalSystem = new MovieRentalSystem();

        Movie movie1 = new Movie(100, "El rey leon", "Rob Minkoff",
                120, "R", "Animada");
        Movie movie2 = new Movie(101, "Pinocho", "Pepe Lucho",
                120, "R", "Animada");
        Movie movie3 = new Movie(102, "El padrino", "Francisco",
                120, "R", "Drama");
        Movie movie4 = new Movie(103, "Star wars", "Alfonso",
                120, "R", "Ficcion");
        Movie movie5 = new Movie(104, "El aro", "Richard",
                120, "R", "Terror");


        Customer customer1 = new Customer("76920406", "Arturo");
        Customer customer2 = new Customer("12345678", "Jose");
        Customer customer3 = new Customer("95873241", "Lala");
        Customer customer4 = new Customer("69421875", "Armando");

        movieRentalSystem.addItem(movie1);
        movieRentalSystem.addItem(movie2);
        movieRentalSystem.addItem(movie3);
        movieRentalSystem.addItem(movie4);
        movieRentalSystem.addItem(movie5);

        movieRentalSystem.registerCustomer(customer1);
        movieRentalSystem.registerCustomer(customer2);
        movieRentalSystem.registerCustomer(customer3);
        movieRentalSystem.registerCustomer(customer4);


        while(true) {
            System.out.println("Ingrese la opcion: ");
            System.out.println("1. Mostrar peliculas disponibles");
            System.out.println("2. Prestar una pelicula");
            System.out.println("3. Retornar pelicula");
            System.out.println("4. Salir");
            System.out.println("=================================================");

            int opcion = sc.nextInt();
            if (opcion == 1) {
                movieRentalSystem.showAllItems(false);
            } else if (opcion == 2) {
                System.out.println("Ingrese el ID del item");
                int itemId = sc.nextInt();
                System.out.println("Ingrese el ID del cliente");
                String userId = sc.next();
                movieRentalSystem.rentMovieCustomer(itemId, userId);
            } else if (opcion == 3) {
                System.out.println("Ingrese el ID del item");
                int itemId = sc.nextInt();
                System.out.println("Ingrese el ID del usuario");
                String userId = sc.next();
                //movieRentalSystem.re(itemId, userId);
            }else if (opcion == 4){
                return;
            }

            System.out.println("=================================================");
        }
    }
}
