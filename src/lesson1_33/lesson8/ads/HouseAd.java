package lesson1_33.lesson8.ads;

public class HouseAd extends Ad {

    String ownerName;
    String adress;
    double aquare;
    int floors;

    public HouseAd(int price, long id, String ownerName, String adress, double aquare, int floors) {
        super(id, price);
        this.ownerName = ownerName;
        this.adress = adress;
        this.aquare = aquare;
        this.floors = floors;
    }

    boolean checkOwner() {
        Owners owners = new Owners();

        for (String owner : owners.owners) {
            if (ownerName == owner) {
                return true;
            }
        }
        return false;
    }

}
