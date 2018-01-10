import car.Car;
import linked.list.LinkedList;

public class Demo {
    public static void main(String[] args) {
        Car a = new Car("1");
        Car b = new Car("2");
        Car c = new Car("3");
        Car d = new Car("4");

        LinkedList list = new LinkedList();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.remove(a);
        list.getAll();
    }
}
