package linked.list;


import java.util.ArrayList;
import java.util.List;


public class LinkedList {
    Element head = null;
    List<String> list = new ArrayList();

    public void add(Carr value) {
        if (head == null) {
            head = new Element(null, value);
        }
        Element temp = new Element(head, value);
        head = temp;
        System.out.println(value.getName());
    }

    public void remove(Carr car) {
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
        private Carr value;

        Element(Element next, Carr value) {
            this.next = next;
            this.value = value;
        }
    }
}

class Carr {
    private String name;

    Carr(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class User {
    public static void main(String[] args) {
        Carr a = new Carr("1");
        Carr b = new Carr("2");
        Carr c = new Carr("3");
        Carr d = new Carr("4");
        LinkedList list = new LinkedList();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.remove(a);
        list.getAll();
    }
}

