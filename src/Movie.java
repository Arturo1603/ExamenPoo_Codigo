public class Movie extends RentalItem{

    //declaracion de atributos

    private String director;
    private int duration;
    private String ageRating;
    private String genre;


    //Creacion constructor

    public Movie(int itemId, String itemName,
                 String director, int duration, String ageRating, String genre){

        super(itemId, itemName);
        this.director = director;
        this.duration = duration;
        this.ageRating = ageRating;
        this.genre = genre;

    }

    //getters y setters

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //sobreescritura para mostrar nuevos atributos
    @Override
    public void showDetails(){
       super.showDetails();
        System.out.println("director: " + director);
        System.out.println("duration: " + duration);
        System.out.println("clasificacion: " + ageRating);
        System.out.println("genero: " + genre);
    }

}
