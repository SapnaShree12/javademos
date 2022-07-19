class Car {
        int wheel;
        float price;
        String color;
        void start() {
            int temp=100;
            System.out.println("Car Start");
            System.out.println("Wheel "+wheel);
            System.out.println("Price "+price);
            System.out.println("Color "+color);
            System.out.println("temp "+temp);
        }
        void appliedGear() {
            System.out.println("Applied Gear");
        }
        void moving() {
            System.out.println("Car is moving");
        }
        void stop() {
            String msg="Welcome";
            System.out.println("Car Stop");
            System.out.println("Wheel "+wheel);
            System.out.println("Price "+price);
            System.out.println("Color "+color);
            System.out.println("msg "+msg);
        }
}
class App {
    public static void main(String args[]) {
    System.out.println("Main method");
    //start();
    Car innova = new Car();
    innova.start();
    innova.stop();
    }
}

