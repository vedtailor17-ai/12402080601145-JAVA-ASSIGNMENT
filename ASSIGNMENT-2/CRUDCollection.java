import java.util.*;

public class CRUDCollection {

    public static void main(String[] args) {

        // ArrayList for storing student names
        ArrayList<String> students = new ArrayList<>();

        students.add("Virat");
        students.add("Rohit");
        students.add("Ved");

        System.out.println("ArrayList (Student Names): " + students);

        // HashMap for storing student ID and Name
        HashMap<Integer, String> studentMap = new HashMap<>();

        // CREATE
        studentMap.put(101, "Virat");
        studentMap.put(102, "Rohit");
        studentMap.put(103, "Ved");

        System.out.println("HashMap (Student Records): " + studentMap);

        // READ
        System.out.println("Student with ID 102: " + studentMap.get(102));

        // UPDATE
        studentMap.put(102, "Rohit Patel");
        System.out.println("Updated Record: " + studentMap);

        // DELETE
        studentMap.remove(101);
        System.out.println("After Deletion: " + studentMap);

        // TreeMap for sorted student records
        TreeMap<Integer, String> sortedMap = new TreeMap<>(studentMap);

        System.out.println("TreeMap (Sorted Records): " + sortedMap);
    }
}
