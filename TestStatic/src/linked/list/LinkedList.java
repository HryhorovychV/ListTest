package linked.list;

import car.Car;

public class LinkedList {
    Element head = null;

    public void add(Car value) {
        if (head == null) {
            head = new Element(null, value);
        }
        Element temp = new Element(head, value);
        head = temp;
        System.out.println(value.getName());
    }

    public void remove(Car car) {
        if (head == null)
            return;
        Element current = head;
        Element prev = null;
        while (current.next != null) {
            if (current.value.equals(car)) {
                if (current == head) {
                    head = current.next;
                    return;
                }
                if (current.next == null) {
                    prev.next = null;
                    return;
                }
                prev.next = current.next;
                return;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    public void getAll() {
        Element temp = head;
        while (temp != null) {
            if (temp.next == null)
                return;
            System.out.println(temp.value.getName());
            temp = temp.next;
        }
    }

    class Element {
        private Element next;
        private Car value;

        Element(Element next, Car value) {
            this.next = next;
            this.value = value;
        }
    }
}


