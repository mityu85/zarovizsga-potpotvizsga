package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.*;

public class UniqueFinder {

    public List<Character> uniqueChars(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot null");
        }
        Set<Character> charactersSet = new LinkedHashSet<>();
        List<Character> characterList = new ArrayList<>();
        fillUpSetFromString(str, charactersSet);
        fillUpListFromSet(charactersSet, characterList);
        return characterList;
    }

    private void fillUpSetFromString(String str, Set<Character> charactersSet) {
        for (int i = 0; i < str.length(); i++) {
            charactersSet.add(str.charAt(i));
        }
    }

    private void fillUpListFromSet(Set<Character> charactersSet, List<Character> characterList) {
        for (Character character: charactersSet) {
            characterList.add(character);
        }
    }
}
