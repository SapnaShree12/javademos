


class Cars {
    int wheel;
    float price;
    String color;
    void displayCarInfo() {
        System.out.println("Wheel "+wheel);
        System.out.println("Price "+price);
        System.out.println("Color "+color);
    }
}
class Car {
public static void main(String args[]) {
Cars innova = new Cars();
innova.displayCarInfo();
innova.wheel = 4;
innova.color="Gray";
innova.price = 1800000;
innova.displayCarInfo();    
}
}