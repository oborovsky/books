/**
 * Created by ulihtenshtein on 07.10.15.
 */
public class Book {
    private String mAuthor;
    private String mName;
    private int mSheets;
    public Book(String author, String name, int sheets) {
        mAuthor = author;
        mName = name;
        mSheets = sheets;
    }
    public Book(){
        this("anonymous", "noname", 0);
    }
    public Book(int sheets) {
        this("anonymous", "noname", sheets);
    }
    public Book(String name, int sheets) {
        this("anonymous", name, sheets);
    }
    public void setAuthor(String author) {
        mAuthor = author;
    }
    public String getAuthor(){
        return mAuthor;
    }
    public void setName(String name) {
        mName = name;
    }
    public String getName() {
        return mName;
    }
    public void setSheets(int sheets) {
        if ( sheets < 0 ) return;
        mSheets = sheets;
    }
    public int getSheets() {
        return mSheets;
    }
    public String toString() {
        String out = "Author: " + mAuthor + "\n Name: " + mName + "\n sheets: " + mSheets;
        return  out;
    }
    public static void main(String[] args){
        Book bk = new Book();
        System.out.println(bk);
        Book bk1 = new Book("Chehov", "Three Sisters", 163);
        System.out.println(bk1);
    }
}
