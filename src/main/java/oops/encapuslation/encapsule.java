package oops.encapuslation;

public class encapsule {
    public static void main(String[] args) {
        encap ee=new encap();
        ee.setTravel_name("red bus");
        ee.setSource("dharmapuri");
        ee.setDestination("ooty");
        ee.setDate(24/07/2025);
        ee.setPrice(500);

        System.out.println("Travel name is :"+ ee.getTravel_name());
        System.out.println("source :"+ee.getSource());
        System.out.println("destination :"+ee.getDestination());
        System.out.println("date :"+ee.getDate());
        System.out.println("price :"+ee.getPrice());
    }
}
