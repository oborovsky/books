import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by ulihtenshtein on 07.10.15.
 */
public class NoteBook extends Book {
    private Student mOwner;
    public void setOwner(Student owner) {
        mOwner = owner;
        setAuthor(owner.getName());
    }
    public Student getOwner() {
        return mOwner;
    }
    public NoteBook(String name, int sheets) {
        this(name, sheets, new Student());
    }
    public NoteBook(Student owner){
        this("notes", 18, owner);
    }
    public NoteBook() {
        this(new Student());
    }
    public NoteBook(String name, int sheets, Student owner) {
        super(owner.getName(), name, sheets);
        mOwner = owner;
    }
    public String toString() {
        String out = super.toString() + "\n owner: " + mOwner.getName();
        return out;
    }
    public static void main(String[] args){
        NoteBook nb = new NoteBook("maths", 22);
        System.out.println(nb);
    }
}
