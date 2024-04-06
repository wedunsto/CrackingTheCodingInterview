// Objective: Determine if all characters in a string are unique. Dont use data structures

public class IsUniqueLoop {
    private static boolean isUnique(String inputString) {
        for(int i=0; i<inputString.length(); i++) {
            for(int j=i+1; j<inputString.length()-1; j++) {
                if(inputString.charAt(j) == inputString.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String inputString = "aacd";
        if(isUnique(inputString)) {
            System.out.println("All characters in the string are unique.");
        } else {
            System.out.println("All characters in the string are not unique.");
        }
    }
}
