class Parking_Garage{

    public int parking_spaces;

    public Parking_Garage(){

    }

    public void decreaseParkingSpots(int decrease){

    }

    public void increaseParkingSpots(int increase){

    }

    public String toString(){
         return null;
    }
}

class Kiosk extends Parking_Garage{

    public Kiosk(){

    }

    public void payTicket(){}

}

class Ticket extends Kiosk{

    // Constructor receives ticket price, start hour and end hour
    public Ticket(){}

    int price;
    int startHour;
    int endHour;
    int finalPrice;

}

class Vehicles extends Parking_Garage{

    public Vehicles(){}

    int parkingSpots;

}

class specialParking extends Vehicles{

    // include electric and disabled parking
    public specialParking(){}

}

class Motorcycles extends Parking_Garage{

    public Motorcycles(){}
    int parkingSpots;
}