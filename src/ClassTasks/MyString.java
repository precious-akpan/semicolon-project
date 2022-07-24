package ClassTasks;

public class MyString {
    private char[] charArray;

    public MyString(String s) {
        this.charArray = s.toCharArray();
    }

    public int indexOf(String substring, boolean ignoreCase) {
        char[] substringCharArray = substring.toCharArray();
        int lengthOfSubstring = substring.length();
        for (int i = 0; i < charArray.length; i++) {
            char[] subArray = new char[lengthOfSubstring];
            for (int j = 0; j < lengthOfSubstring; j++) {
                subArray[j] = charArray[j];
            }
            for (int j = 0; j < subArray.length; j++) {

            }
        }
    return 0;}}
