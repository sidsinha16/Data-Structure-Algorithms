class Solution {
    public boolean isValid(String word) {
        // Return false if the word is too short
        if (word.length() < 3) {
            return false;
        }

        // Initialize flags to check for vowels and consonants
        boolean hasVowel = false;
        boolean hasConsonant = false;

        // Create a boolean array to identify vowels: a, e, i, o, u
        boolean[] isVowel = new boolean[26];
        for (char c : "aeiou".toCharArray()) {
            isVowel[c - 'a'] = true;
        }

        // Iterate through each character in the word
        for (char c : word.toCharArray()) {
            // Check if character is alphabetic
            if (Character.isAlphabetic(c)) {
                // Check if the character is a vowel
                if (isVowel[Character.toLowerCase(c) - 'a']) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            } else if (!Character.isDigit(c)) { // Non-alphanumeric character found
                return false;
            }
        }

        // Return true only if the word contains at least one vowel and one consonant
        return hasVowel && hasConsonant;
    }
}