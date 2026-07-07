import java.util.*;

// Generic Pair Class
class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println("Pair: " + first + " , " + second);
    }
}

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    void push(T item) {
        list.add(item);
    }

    T pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return list.remove(list.size() - 1);
    }

    void display() {
        System.out.println(list);
    }
}

// Generic Repository
class Repository<T> {
    private ArrayList<T> data = new ArrayList<>();

    void add(T item) {
        data.add(item);
    }

    void display() {
        System.out.println(data);
    }
}

// Entity Class
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GenericDemo {

    // Generic Method with Comparable Bound
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    // Wildcard Method
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Pair
        Pair<String, Integer> p = new Pair<>("Tarun", 101);
        p.display();

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped : " + stack.pop());

        stack.display();

        // findMax()
        Integer[] numbers = {12, 45, 7, 89, 23};

        System.out.println("Maximum = " + findMax(numbers));

        // Repository
        Repository<Student> repo = new Repository<>();

        repo.add(new Student("Tarun"));
        repo.add(new Student("Aman"));

        repo.display();

        // Wildcard
        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");

        printList(names);
    }
}