/*
3.12 (Class PetrolPurchase) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of
instance variables—the station’s location (type String), the type of petrol (type String), the quantity
(type int) of the purchase in liters, the price per liter (double), and the percentage discount
(double). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named getPurchaseAmount
that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value.
 Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase.
 */
package Chapter_3_Exercise;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantityInLitres;
    private double pricePerLitre;
    private double percentageDiscount;

    public void setDiscountAmount() {
        this.discountAmount =  (percentageDiscount / 100 ) * getPurchaseAmount();
    }

    private double discountAmount;

    public double getDiscountAmount() {
        return discountAmount;
    }



    public PetrolPurchase(String location,
                          String petrolType,
                          int quantityInLitres,
                          double pricePerLitre,
                          double percentageDiscount
    ) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantityInLitres = quantityInLitres;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
        setDiscountAmount();
    }

    public double getPurchaseAmount() {
        double netAmount;
        return (quantityInLitres * pricePerLitre - discountAmount);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantityInLitres() {
        return quantityInLitres;
    }

    public void setQuantityInLiters(int quantityInLitres) {
        this.quantityInLitres = quantityInLitres;
    }

    public double getPricePerLiter() {
        return pricePerLitre;
    }

    public void setPricePerLiter(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount /100 * pricePerLitre;
    }
}
