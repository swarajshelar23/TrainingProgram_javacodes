package DAY10.Polymorphism.Parking;

public class App {
    public static void main(String[] args) {
        Parking lot[] = 
                {
                new Car(), new Bike(), new Truck(),
                new Car(), new Bike(), new Truck(),
                new Car(), new Bike(), new Truck(),
                new Car(), new Bike(), new Truck(),
                new Car(), new Bike(), new Truck()
                };
        

        int bike = 0;
        int car = 0;
        int truck = 0;
        int countofcars = 0;
        int countofbikes = 0;
        int countoftrucks = 0;

        for (Parking p : lot) {
            if (p instanceof Car) {
                car = car + p.toll();
                countofcars++;
            } else if (p instanceof Bike) {
                bike = bike + p.toll();
                countofbikes++;
            } else if (p instanceof Truck) {
                truck = truck + p.toll();
                countoftrucks++;
            }
        }


        System.out.println("Total toll: " + (car + bike + truck) + " (Cars: " + car + ", Bikes: " + bike + ", Trucks: " + truck + ")");
        System.out.println("Number of cars: " + countofcars);
        System.out.println("Number of bikes: " + countofbikes);
        System.out.println("Number of trucks: " + countoftrucks);
        
    }
}
