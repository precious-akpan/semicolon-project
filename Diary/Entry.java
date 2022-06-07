package Diary;

public class Entry {
    public Entry(String testTitle, String testBody) {
        if (testTitle.length() == 0) {
            throw new IllegalArgumentException("title cannot be empty");
        }

        if (testBody.isEmpty()) {
            throw new IllegalArgumentException("body cannot be empty");
        }
    }
}
