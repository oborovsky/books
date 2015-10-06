import java.util.ArrayList;

/**
 * Created by ulihtenshtein on 07.10.15.
 */
public class Student {
    private String mName;
    private int mAge;
    private int mGroup;
    private int mCourse;
    private String mFaculty;
    private String mUni;
    private ArrayList<Book> mListBooks;
    public Student(String name, int age, int group, int course, String faculty, String uni) {
        mName = name;
        mAge = age;
        mGroup = group;
        mCourse = course;
        mFaculty = faculty;
        mUni = uni;
        mListBooks = new ArrayList<>();
    }
    public Student(String name, int age, int group) {
        this(name, age, group, 1, "mmf", "Novosibirsk State University");
    }
    public Student(String name, int age) {
        this(name, age, 14136);
    }
    public Student() {
        this("a student", 18);
    }
    public void addBook(Book book) {
        if (book instanceof NoteBook) {
            ((NoteBook) book).setOwner(this);
        }
        mListBooks.add(book);
    }
    public ArrayList<Book> getBooks() {
        return mListBooks;
    }
    public void setBooks(ArrayList<Book> books) {
        mListBooks = books;
    }
    public String toString(){
        String out = "Student: " + mName + ", group: " + mGroup + ", course: " + mCourse + ", faculty: " + mFaculty;
        out += "\n " + mUni + "\n" + " his/her list of books:";
        if (mListBooks.size() == 0) out += "is empty";
        for (int i = 0; i < mListBooks.size(); i++) {
            out += "\n";
            Book bk = mListBooks.get(i);
            out += (i+1) + ")" + bk.toString() + "\n ----------------------------\n";
        }
        return out;
    }
    public String getName() {
        return mName;
    }
    public static void main(String[] args) {
        Student st = new Student ("Uko", 22);
        StudentBook sb = new StudentBook("Demidovich", "Tasks", 528, 1977);
        NoteBook nb = new NoteBook("math", 60);
        System.out.println(st);
        System.out.println(sb);
        System.out.println(nb);
        st.addBook(sb);
        st.addBook(nb);
        System.out.println(st);

    }
}
