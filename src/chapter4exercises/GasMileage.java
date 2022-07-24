package chapter4exercises;

public class GasMileage {
    private int miles;
    private int gallons;

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        if (miles < 0) {
            System.out.println("Miles cannot be less than zero");
            return;
        }
            this.miles = miles;
    }


    public int getGallons() {
        return gallons;
    }

    public void setGallons(int gallons) {
        if (gallons < 1) {
            return;
        }
        this.gallons = gallons;
    }

    public int calculateMPG(int miles, int gallons) {
        return miles / gallons;
    }
}
