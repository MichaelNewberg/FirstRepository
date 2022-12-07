public class CarTrack {
    public static void main(String[] args) {
        Car george=new Car("George", 10);//needed to add value for gas since method edited.
        System.out.println(george.owner);//this works since the CarTrack.java Class is in the same Directory as the Car.java Class
        Car.checkCount();//this MUST be called by the Car.java class
    }
}
