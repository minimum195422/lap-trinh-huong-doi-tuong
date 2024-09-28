/**
 * Class student.
 */
public class Student {
    /**
     * Tên.
     */
    private String name;

    /**
     * Mã sinh viên.
     */
    private String id;

    /**
     * Lớp.
     */
    private String group;

    /**
     * Mail.
     */
    private String email;

    /**
     * Cài tên sinh viên.
     * @param name tên sinh viên.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Cài id sinh viên.
     * @param id mã id sinh viên.
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Cài lớp học của sinh viên.
     * @param group lớp học.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Cài email của sinh viên.
     * @param email email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Lấy tên sinh viên.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Lấy id sinh viên.
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     * Lấy lớp học sinh viên.
     * @return group.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Lấy email sinh viên.
     * @return email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Constructor.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor.
     * @param name tên.
     * @param id id.
     * @param email email.
     *  Trong constructor này thì nhóm được cài mặc định là - K62CB.
     *
     */
    public Student(String name, String id, String email) {
        this.setName(name);
        this.setId(id);
        this.setGroup("K62CB");
        this.setEmail(email);
    }


    /**
     * Constructor.
     * @param s là một sinh viên.
     */
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }


    /**
     * Lấy thông tin.
     * @return String theo định dạng cho trước.
     */
    public String getInfo() {
        return this.getName() + " - "
                + this.getId() + " - "
                + this.getGroup() + " - "
                + this.getEmail();
    }
}

