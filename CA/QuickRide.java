package CA;

interface Book {
    void scheduleRide();
    void cancelRide();
}

interface BookingAttributes {
    int Id = 0;
    int Price = 0;
}

abstract class CabRide implements Book, BookingAttributes {

    int Id;
    int Price;

    public void scheduleRide() {
        System.out.println("Cab ID: " + Id + " is scheduled for a ride for " + Price + " rupees. At 10:00AM");
    }

    public void cancelRide() {

        int newPrice = Price - 200;
        System.out.println("Cab ID: " + Id + " ride is canceled. Refund is " + newPrice + " rupees.");
    }

}

abstract class TrainRide implements Book, BookingAttributes {

    int Id;
    int Price;

    public void scheduleRide() {
        System.out.println("Train No: " + Id + " is scheduled for a ride for " + Price + " rupees. At 10:00AM");
    }

    public void cancelRide() {

        int newPrice = Price - 200;
        System.out.println("Train No: " + Id + " ride is canceled. Refund is " + newPrice + " rupees.");
    }

}

abstract class BusRide implements Book, BookingAttributes {

    int Id;
    int Price;

    public void scheduleRide() {
        System.out.println("Bus No: " + Id + " is scheduled for a ride for " + Price + " rupees. At 10:00AM");
    }

    public void cancelRide() {
        System.out.println("Bus No: " + Id + " ride is canceled. No refund.");
    }

}

public class QuickRide {
    public static void main(String[] args) {

        CabRide cabRide = new CabRide() {
            {
                Id = 101;
                Price = 500;
            }
        };

        TrainRide trainRide = new TrainRide() {
            {
                Id = 202;
                Price = 1200;
            }
        };

        BusRide busRide = new BusRide() {
            {
                Id = 303;
                Price = 200;
            }
        };

        cabRide.scheduleRide();
        cabRide.cancelRide();

        trainRide.scheduleRide();
        trainRide.cancelRide();

        busRide.scheduleRide();
        busRide.cancelRide();
    }
}
