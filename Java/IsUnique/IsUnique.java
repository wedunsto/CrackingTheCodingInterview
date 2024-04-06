import java.util.HashMap;

class IsUnique {
    private static HashMap<String, Integer> populateHashMap(String inputString) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i=0; i<inputString.length(); i++) {
            if(hashMap.containsKey(inputString.charAt(i)+" ")) {
                hashMap.put(inputString.charAt(i)+" ", hashMap.get(inputString.charAt(i)+" ") + 1);
            } else {
                hashMap.put(inputString.charAt(i)+" ", 1);
            }
        }

        return hashMap;
    }

    private static boolean determineUniqueString(HashMap<String, Integer> hashMap) {
        for(Integer value : hashMap.values()) {
            if(value > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = populateHashMap("abcd");
        if(determineUniqueString(map) == true) {
            System.out.println("All characters in this string are unique.");
        } else {
            System.out.println("All characters in this string are not unique.");
        }
    }
}