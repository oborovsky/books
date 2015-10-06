/**
 * Created by ulihtenshtein on 07.10.15.
 */
public class StudentBook extends Book {
    private int mExpiredYear;
    private int mYear;
    public StudentBook(String author, String name, int sheets, int year) {
        super(author, name, sheets);
        mYear = year;
        setExpiredYear(year);
    }
    public StudentBook(int year) {
        super();
        mYear = year;
        setExpiredYear(year);
    }
    public StudentBook() {
        this(1961);
    }
    private void setExpiredYear(int year) {
        if (year < 0 ) year = 0;
        if (year < 2003) {
            mExpiredYear = 2015;
        } else {
            mExpiredYear = 2020;
        }
    }
    public void setYear(int year) {
        mYear = year;
        setExpiredYear(year);
    }
    public int getYear() {
        return mYear;
    }
    public int getmExpiredYear() {
        return mExpiredYear;
    }
    public String toString() {
        String out = super.toString();
        out += "\n year: " + mYear + "\n expired: " + mExpiredYear + ".";
        return out;
    }
    public static void main(String[] args) {
        StudentBook sbk = new StudentBook();
        System.out.println(sbk);
        StudentBook sbk2 = new StudentBook("Kolmogorov", "Mathematic", 623, 2010);
        System.out.println(sbk2);
    }
}
