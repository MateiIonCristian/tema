// Clasa Car
class Car {
    private String brand;
    private String model;
    private int year;
    private double speed;

    // Constructor
    public Car(String brand, String model, int year, double speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    // Suprascrierea metodei toString()
    @Override
    public String toString() {
        return String.format("Detalii vehicul:\nMarca: %s\nModel: %s\nAnul: %d\nViteza maximă: %.1f km/h",
                brand, model, year, speed);
    }

    public static void main(String[] args) {
        // Creăm un obiect Car
        Car myCar = new Car("Tesla", "Model S", 2022, 322.0);

        // Afișăm obiectul (se va apela automat toString())
        System.out.println(myCar);
    }
}
