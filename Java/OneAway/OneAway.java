package OneAway;
// Objective: Determine if two strings are "one edit" away

import java.util.HashMap;

public class OneAway {
    // Confirm if 2 or less characters have an odd count
    private static boolean isInsertedDeletedOrReplaced(HashMap<String, Integer> characterCount) {
        int oddCharacterCount = 0;

        for(int i : characterCount.values()) {
            if(i % 2 != 0) {
                oddCharacterCount++;
            }
        }

        return oddCharacterCount <= 2;
    }

    private static boolean oneEditAway(String inputString1, String inputString2) {
        // The strings are more than 1 character apart
        if(Math.abs(inputString1.length() - inputString2.length()) > 1) {
            return false;
        } else {
            // Store the counts of all character occurrences
            HashMap<String, Integer> characterCount = new HashMap<>();
            
            for(int i=0; i<inputString1.length(); i++) {
                characterCount.put(inputString1.charAt(i)+"", 1);
            }

            for(int i=0; i<inputString2.length(); i++) {
                // If the character is already a key, increment its count
                if(characterCount.containsKey(inputString2.charAt(i)+"")) {
                    characterCount.put(inputString2.charAt(i)+"", characterCount.get(inputString2.charAt(i)+"") + 1);
                } else {
                    characterCount.put(inputString2.charAt(i)+"", 1);
                }
            }

            if(isInsertedDeletedOrReplaced(characterCount)) return true;

            return false;
        }


    }
    public static void main(String[] args) {
        boolean same = oneEditAway("pale", "pale");
        if(same) System.out.println("These strings are 1 or less edits away");

        boolean insert = oneEditAway("pale", "pales");
        if(insert) System.out.println("These strings are 1 or less edits away");

        boolean remove = oneEditAway("pale", "ple");
        if(remove) System.out.println("These strings are 1 or less edits away");
        
        boolean replace = oneEditAway("pale", "bale");
        if(replace) System.out.println("These strings are 1 or less edits away");

        boolean error = oneEditAway("pale", "bake");
        if(!error) System.out.println("These strings are more than 1 edit away");
    }
}
