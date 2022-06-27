package ClassTasks;

public class StringMethods {
    public static void main(String[] args) {

        String s = "abcdabcdabca";
        int numberOfAs = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                numberOfAs++;
                System.out.println("A was found at index: "+i);

            }
        }
        System.out.println("Number of A's: " + numberOfAs);

        System.out.println(countOccurences("elephant", 'a', 0));

    }
    private static int countOccurences(
            String someString, char searchedChar, int index) {
        if (index >= someString.length()) {
            return 0;
        }

        int count = someString.charAt(index) == searchedChar ? 1 : 0;
        return count + countOccurences(
                someString, searchedChar, index + 1);
    }


}
