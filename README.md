class Adresa {
    private String strada;
    private String oras;
    private String codPostal;

    public Adresa(String strada, String oras, String codPostal) {
        this.strada = strada;
        this.oras = oras;
        this.codPostal = codPostal;
    }

    public String getAdresaCompleta() {
        return strada + ", " + oras + ", " + codPostal;
    }
}

class Profesor {
    private String nume;
    private Adresa adresa;

    public Profesor(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String toString() {
        return "Profesor: " + nume + "\nAdresa: " + adresa.getAdresaCompleta();
    }
}

class Student {
    private String nume;
    private Adresa adresa;

    public Student(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String toString() {
        return "Student: " + nume + "\nAdresa: " + adresa.getAdresaCompleta();
    }
}

class Curs {
    private String nume;
    private Profesor profesor;
    private java.util.List<Student> studenti;

    public Curs(String nume, Profesor profesor) {
        this.nume = nume;
        this.profesor = profesor;
        this.studenti = new java.util.ArrayList<>();
    }

    public void addStudent(Student student) {
        studenti.add(student);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curs: " + nume + "\nProfesor: " + profesor.getNume() + "\nStudenti: ");
        for (Student s : studenti) {
            sb.append(s.getNume() + ", ");
        }
        return sb.toString().trim();
    }
}

class Car {
    private int speed;
    private boolean engineRunning;

    public Car() {
        this.speed = 0;
        this.engineRunning = false;
    }

    public void start() {
        if (engineRunning) {
            System.out.println("Engine is already running.");
        } else {
            engineRunning = true;
            System.out.println("Car engine started.");
        }
    }

    public void stop() {
        if (engineRunning) {
            engineRunning = false;
            speed = 0;
            System.out.println("Car stopped.");
        } else {
            System.out.println("Engine is not running.");
        }
    }

    public void accelerate() {
        if (engineRunning) {
            speed += 10;
            System.out.println("Car accelerated. Speed: " + speed + " km/h");
        } else {
            System.out.println("Start the engine first.");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void startEngine() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("Engine started.");
        }
    }

    public void stopEngine() {
        if (engineRunning) {
            engineRunning = false;
            speed = 0;
            System.out.println("Engine stopped.");
        }
    }
}

class MyCuteCar extends Car {
    private boolean rocketEngineRunning;

    public MyCuteCar() {
        super(); // Calls the constructor of Car
        this.rocketEngineRunning = false;
    }

    public void startRocketEngine() {
        if (rocketEngineRunning) {
            System.out.println("Rocket engine is already running.");
        } else {
            rocketEngineRunning = true;
            System.out.println("Rocket engine started!");
        }
    }

    public void stopRocketEngine() {
        if (rocketEngineRunning) {
            rocketEngineRunning = false;
            System.out.println("Rocket engine stopped.");
        } else {
            System.out.println("Rocket engine is not running.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Crearea obiectelor
        Adresa adresaProf = new Adresa("Str. Mihai Viteazu", "Craiova", "200123");
        Profesor prof = new Profesor("Ion Popescu", adresaProf);

        Adresa adresaStud1 = new Adresa("Str. Unirii", "Craiova", "200345");
        Student stud1 = new Student("Andrei Georgescu", adresaStud1);

        Adresa adresaStud2 = new Adresa("Str. București", "Craiova", "200567");
        Student stud2 = new Student("Maria Ionescu", adresaStud2);

        Curs cursJava = new Curs("Programare Java", prof);
        cursJava.addStudent(stud1);
        cursJava.addStudent(stud2);

        // Utilizare metode toString()
        System.out.println(prof.toString());
        System.out.println(stud1.toString());
        System.out.println(stud2.toString());
        System.out.println(cursJava.toString());

        // Testare caruri
        Car car = new Car();
        car.start();
        car.accelerate();
        System.out.println("Car speed: " + car.getSpeed() + " km/h");
        car.stop();

        MyCuteCar myCuteCar = new MyCuteCar();
        myCuteCar.startEngine();
        myCuteCar.accelerate();
        myCuteCar.startRocketEngine();
        myCuteCar.stopRocketEngine();
        myCuteCar.stop();
    }
}
