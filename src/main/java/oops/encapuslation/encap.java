package oops.encapuslation;

public class encap {
    String Travel_name;
    String source;
    String destination;
    int date;
    int price;

    public String getTravel_name() {
        return Travel_name;
    }

    public void setTravel_name(String travel_name) {
        Travel_name = travel_name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
