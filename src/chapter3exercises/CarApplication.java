package chapter3exercises;

public class CarApplication {
    public static void main(String[] args) {
        Car mercedes = new Car("A-class", "2019", 35000);

        Car toyota = new Car("Camry", "2020", 15000);

        System.out.printf("Toyota %s %s is $%s%n%n", toyota.getModel(), toyota.getYear(), toyota.getPrice());
        System.out.printf("Mercedes %s %s is $%s%n", mercedes.getModel(), mercedes.getYear(), mercedes.getPrice());

//        System.out.println("Car price after discount is added: ");
        //adding percentage discounts to prices
        mercedes.setDiscountPercentage(5);
        toyota.setDiscountPercentage(10);
        mercedes.setPrice(35000);
        toyota.setPrice(15000);
        System.out.println("Mercedes New Price after discount: " + mercedes.getPrice());
        System.out.println("Toyota New Price after discount: " + toyota.getPrice());
    }


}
