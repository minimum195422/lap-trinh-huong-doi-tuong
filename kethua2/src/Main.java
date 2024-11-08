public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person person = new Person("Alice", "123 Main St");
        System.out.println("Person: " + person.toString());

        // Thay đổi thuộc tính của Person
        person.setAddress("456 Oak St");
        System.out.println("Updated Person: " + person.toString());

        // Tạo đối tượng Student
        Student student = new Student("Bob", "789 Elm St", "Computer Science", 2024, 10000.0);
        System.out.println("Student: " + student.toString());

        // Sử dụng setter để thay đổi thông tin của Student
        student.setProgram("Mathematics");
        student.setYear(2025);
        student.setFee(11000.0);
        System.out.println("Updated Student: " + student.toString());

        // Tạo đối tượng Staff
        Staff staff = new Staff("Charlie", "321 Pine St", "XYZ School", 50000.0);
        System.out.println("Staff: " + staff.toString());

        // Sử dụng setter để thay đổi thông tin của Staff
        staff.setSchool("ABC School");
        staff.setPay(55000.0);
        System.out.println("Updated Staff: " + staff.toString());
    }
}