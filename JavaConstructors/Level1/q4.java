package JavaConstructors.Level1;

public class q4 {
    static class HotelBooking {
        String guestName;
        String roomType;
        int nights;

        // Default constructor
        HotelBooking() {
            this.guestName = "Unknown Guest";
            this.roomType = "Standard";
            this.nights = 1;
        }

        // Parameterized constructor
        HotelBooking(String guestName, String roomType, int nights) {
            this.guestName = guestName;
            this.roomType = roomType;
            this.nights = nights;
        }

        // Copy constructor
        HotelBooking(HotelBooking other) {
            this.guestName = other.guestName;
            this.roomType = other.roomType;
            this.nights = other.nights;
        }

        void display() {
            System.out.println("Guest Name: " + guestName);
            System.out.println("Room Type: " + roomType);
            System.out.println("Nights: " + nights);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.display();

        // Parameterized constructor
        HotelBooking booking2 = new HotelBooking("Abhinav", "Deluxe", 3);
        System.out.println("Custom Booking:");
        booking2.display();

        // Copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Copied Booking:");
        booking3.display();
    }
}
