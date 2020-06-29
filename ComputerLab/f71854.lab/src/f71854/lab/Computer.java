package f71854.lab;

import java.time.LocalDate;
import java.util.Random;

public class Computer {
    private final String id;
    private Brand make;
    private double price;
    private LocalDate registrationDate;


    public Computer() {
        this(Brand.HP, 500, LocalDate.now());
    }

    public Computer(Brand name, double price, LocalDate date) {

        Random rand = new Random();
        int temp = rand.nextInt(17001);
        this.id = "00" + Integer.toString(temp);

        setMake(name);
        setPrice(price);
        setRegistrationDate(date);
    }

    public Computer(Computer other){
        this(other.make, other.price, other.registrationDate);
    }

    public final String getID() {
        return id;
    }

    public Brand getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getRegistrationDate(){
        return registrationDate;
    }

    public void setMake(Brand name) {
        make = name == null ? Brand.HP : name;
    }

    public void setPrice(double newPrice) {
        price = ((newPrice <= 0) ? 500 : newPrice);
    }

    public void setRegistrationDate(LocalDate newDate) {
        registrationDate = newDate == null ? LocalDate.now() : newDate;
    }


    @Override
    public String toString() {
        return String.format("ID: %s, brand: %s, price: %.2f, registration date: %s", id, make, price, registrationDate);
    }
}
