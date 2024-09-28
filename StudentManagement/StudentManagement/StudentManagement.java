import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Class StudentManagement.
 */
public class StudentManagement {
    /**
     * Thuộc tính students là array chứa các đối tượng thuộc lớp Student.
     */
    private final Student[] students = new Student[100];

    /**
     * Thuộc tính count dùng để đếm số lượng phần tử được thêm vào student.
     */
    private int count = 0;

    /**
     * So sánh hai student có giống nhau hay không.
     * @param s1 student1.
     * @param s2 student2.
     * @return boolean.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }


    /**
     * Thêm student.
     * @param newStudent student mới.
     */
    public void addStudent(Student newStudent) {
        if (count < 100) {
            students[count] = newStudent;
            count++;
        }
    }


    /**
     * Sắp xếp student theo nhóm.
     * @return String.
     */
    public String studentsByGroup() {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < count; ++i) {
            if (!list.contains(students[i].getGroup())) {
                list.add(students[i].getGroup());
            }
        }

        for (String group : list) {
            sb.append(group);
            sb.append("\n");
            for (int i = 0; i < count; ++i) {
                if (students[i].getGroup().equals(group)) {
                    sb.append(students[i].getInfo());
                    sb.append("\n");
                }
            }
        }

        return sb.toString();
    }


    /**
     * Xoá student.
     * @param id mã id của student cần xoá.
     */
    public void removeStudent(String id) {
        try {
            for (int i = 0; i < count; ++i) {
                if (students[i].getId().equals(id)) {
                    for (int j = i; j < count - 1; ++j) {
                        students[j] = students[j + 1];
                    }
                    students[count - 1] = null;
                    count--;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Main.
     * @param args the args.
     */
    public static void main(String[] args) {

    }
}
