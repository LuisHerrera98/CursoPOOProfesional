package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passegenger = 4;
        System.out.println("Car license: " + car.license);
    }
}