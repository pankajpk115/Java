package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    private String carId;
    private String carModel;
    private String carBrand;
    private double basePrice;
    private boolean isAvailable;

    public Car(String carId, String carBrand, String carModel, double basePrice) {
        this.carId = carId;
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.basePrice = basePrice;
        this.isAvailable = true;
    }

    public String getCarId() {
        return carId;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public double calculatePrice(int rentalDays) {
        return basePrice * rentalDays;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }

}

class Customer {
    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
}

class Rental {
    private Car car;

    private Customer customer;

    private int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }
}

class CarRentalSystem {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentalCar(Car car, Customer customer, int days) {
        if (car.isAvailable()) {
            car.rent();
            rentals.add(new Rental(car, customer, days));
        } else {
            System.out.println("Car is not available for rent");
        }
    }

    public void returnCar(Car car) {
        car.returnCar();
        Rental rentalToRemove = null;
        for (Rental rental : rentals) {
            if (rental.getCar() == car) {
                rentalToRemove = rental;
                break;
            }
        }
        if (rentalToRemove != null) {
            rentals.remove(rentalToRemove);
            System.out.println("Car returned Successfully");
        } else {
            System.out.println("car was not rented");
        }
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("======= Car Rental System =======");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Exit");
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                System.out.println("\n== Rent a car ==\n");
                System.out.println("Enter your Name");
                String customerName = sc.nextLine();

                System.out.println("\n== Available Cars:");
                for(Car car :cars){
                    if(car.isAvailable()){
                        System.out.println(car.getCarId() +" - "+ car.getCarBrand() + " - " + car.getCarModel());
                    }
                }
                System.out.println("\n Enter the carId you want to rent: ");
                String carId = sc.nextLine();

                System.out.println("\n Enter the number of days you want to rent: ");
                int rentalDays = sc.nextInt();
                sc.nextLine();

                Customer newCustomer = new Customer("CUS"+(customers.size()+1), customerName);
                addCustomer(newCustomer);


                Car selectedCar = null;
                for(Car car:cars){
                    if(car.getCarId().equals(carId) && car.isAvailable()){
                        selectedCar = car;
                        break;
                    }
                }
                if(selectedCar != null){
                    double totalPrice = selectedCar.calculatePrice(rentalDays);
                    System.out.println("\n== Rental Information: ==\n");
                    System.out.println("Customer ID: "+newCustomer.getCustomerId());
                    System.out.println("Customer Name: "+newCustomer.getCustomerName());
                    System.out.println("Selected Car: " + selectedCar.getCarBrand() + " " + selectedCar.getCarModel());
                    System.out.println("Rental Days: " + rentalDays);
                    System.out.println("Total price :" + totalPrice);

                    System.out.println("Confirn Rental(Y/N): ");
                    String confirm = sc.nextLine();

                    if(confirm.equalsIgnoreCase("Y")){
                        rentalCar(selectedCar, newCustomer, rentalDays);
                        System.out.println("Car Rented Succesfully");
                    }
                    else{
                        System.out.println("Rental Cancelled");
                    }
                }
                else{
                    System.out.println("Invalid Car Selection OR car is not available for rent");
                }
            }
            else if(choice == 2){
                System.out.println("\n== Return a car ==");
                System.out.println("Enter the car ID you want to return");
                String carID = sc.nextLine();

                Car carToReturn = null;
                for(Car car:cars){
                    if(car.getCarId().equals(carID) && !car.isAvailable()){
                        carToReturn = car;
                        break;
                    }
                }
                if(carToReturn != null){
                    Customer customer = null;
                    for(Rental rental : rentals){
                        if(rental.getCar() == carToReturn){
                            customer = rental.getCustomer();
                            break;
                        }
                    }
                    if(customer != null){
                        returnCar(carToReturn);
                        System.out.println("Car return succesfull by : "+ customer.getCustomerName());
                    }
                    else{
                        System.out.println("Car was not rented OR rental information missing");
                    }
                }
                else{
                    System.out.println("Invalid car ID OR car is not rented");
                }
            }
            else if(choice == 3){
                break;
            }
            else{
                System.out.println("Invalid Choice! Please select a valid option");
            }
        }
        System.out.println("Thankyou for using the car rental system!");
    }
}

public class project1 {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Toyota", "Camry", 60.0);
        Car car2 = new Car("C002", "Mahindra", "Thar", 90.0);
        Car car3 = new Car("C003", "Suzuki", "WagonR", 1000.0);

        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }
}
