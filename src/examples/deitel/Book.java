package examples.deitel;

public enum Book {
    JHTP("Java How To Program", "2018"),
    CHTP("C How To Program", "2016"),
    IW3HTP("Internet & World Wide Web How To Program", "2012"),
    CPPHTP("C++ How To Program", "2017"),
    VBHTP("Visual Basic How To Program", "2014"),
    CSHARPHTP("Visual C# How To Program", "2017");

    private final String title;
    private final String copyrightYear;

    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }

}
