package CSE;
class Vehicle {
    int maxSpeed = 120;
}
// sub class Car extending vehicle
class Car extends Vehicle {
    int maxSpeed = 180;
    void display()
    {
        // print maxSpeed from the vehicle class 
        // using super
        System.out.println("Maximum Speed: "
                           + super.maxSpeed);
    }
}
// Driver Program
class Super {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}