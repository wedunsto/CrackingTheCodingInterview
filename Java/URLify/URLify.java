package URLify;

// Objectives: Replace spaces in a string with %20

public class URLify {
    private static String URLifyFtn(String inputString, int trueInputStringSize) {
        char[] charArray = new char[inputString.length()];
        int currIndex = 0;

        for(int i=0; i<trueInputStringSize; i++) {
            if(inputString.charAt(i) == ' ') {
                charArray[currIndex] = '%';
                charArray[currIndex + 1] = '2';
                charArray[currIndex + 2] = '0';
                currIndex += 3;
            } else {
                charArray[currIndex] = inputString.charAt(i);
                currIndex++;
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        // Test input strings and the true size of the strings
        String inputString1 = "Mr John Smith      ";
        int inputStringSize1 = 13;
        String inputString2 = "MrJohnSmith";
        int inputStringSize2 = 11;

        System.out.println(URLifyFtn(inputString1, inputStringSize1));

        System.out.println(URLifyFtn(inputString2, inputStringSize2));
    }
}
