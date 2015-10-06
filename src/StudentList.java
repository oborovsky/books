import java.util.ArrayList;

/**
 * Created by ulihtenshtein on 07.10.15.
 */
public class StudentList {
    private ArrayList<Student> mStudentList;
    public StudentList() {
        mStudentList = new ArrayList<>();
    }
    public StudentList( ArrayList<Student> studentList) {
        mStudentList = studentList;
    }
    public Student getStudent(String name ) throws Exception {
        for (int i = 0; i < mStudentList.size(); i++) {
            Student st = mStudentList.get(i);
            if (st.getName() == name ) return st;
        }
        throw new Exception("no such student");
    }
    public String toString(){
        String out = "List of students: \n";
        for(int i = 0; i < mStudentList.size(); i++) {
            Student st = mStudentList.get(i);
            out += st.toString() + "\n =========================================\n";
        }
        return out;
    }
    public void addStudent(Student student) {
        mStudentList.add(student);
    }
    public static void main(String[] args) {
        StudentList stList = new StudentList();
        Student st1 = new Student("Uko",18, 14134);
        Student st2 = new Student("Dick Big", 22);
        StudentBook stBook1 = new StudentBook("Demidovich", "Tasks", 528, 1977);
        StudentBook stBook2 = new StudentBook("Filippov","Tasks DE", 128, 1992);
        NoteBook ntBook1 = new NoteBook("math", 60);
        NoteBook ntBook2 = new NoteBook("prog", 80);
        st1.addBook(stBook1);
        st1.addBook(ntBook1);
        st2.addBook(stBook2);
        st2.addBook(ntBook2);
        stList.addStudent(st1);
        stList.addStudent(st2);
        System.out.println(stList);
        try {
            Student st = stList.getStudent("Uko");
            System.out.println(st);
            st = stList.getStudent("Ukod");
            System.out.println(st);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
