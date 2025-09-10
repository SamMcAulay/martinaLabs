public class Car {

    private long noOfDoors;
    private String TransmissionType;
    private String BodyType;

    public Car(long noOfDoors, String transmissionType, String bodyType) {
        this.noOfDoors = noOfDoors;
        TransmissionType = transmissionType;
        BodyType = bodyType;
    }

    public Car(){
    }

    public void printDetails() {
        System.out.println("No of Doors: " + noOfDoors);
        System.out.println("Transmission Type: " + TransmissionType);
        System.out.println("Body Type: " + BodyType);
        System.out.println("**************************************");
    }
}
