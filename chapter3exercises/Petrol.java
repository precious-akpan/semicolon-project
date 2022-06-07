package chapter3exercises;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase purchase = new PetrolPurchase(
                "Somolu",
                "Premium",
                10,
                100,
                50
        );
        PetrolPurchase newPurchase = new PetrolPurchase(
                "Badagry",
                "Premium",
                50,
                165.5,
                5
        );

        System.out.println("Petrol Station location: " + purchase.getLocation());
        System.out.println("Petrol type is: " + purchase.getPetrolType());
        System.out.println("Quantity in litres is: " + purchase.getQuantityInLitres());
        System.out.println("Price per litre is: " + purchase.getPricePerLiter());
        System.out.println("Discount amount is: $" + purchase.getDiscountAmount());
        System.out.println("Discount percent is: " + purchase.getPercentageDiscount() + "%");
        System.out.println("Price for this purchase is: $" + purchase.getPurchaseAmount());
        System.out.println();
        System.out.println("Petrol Station location: " + newPurchase.getLocation());
        System.out.println("Petrol type: " + newPurchase.getPetrolType());
        System.out.println("Quantity in litres: " + newPurchase.getQuantityInLitres());
        System.out.println("Price per litre: " + newPurchase.getPricePerLiter());
        System.out.println("Discount amount : $" + newPurchase.getDiscountAmount());
        System.out.println("Discount percent : " + newPurchase.getPercentageDiscount() + "%");
        System.out.println("Price for this purchase is: $" + newPurchase.getPurchaseAmount());


    }

}