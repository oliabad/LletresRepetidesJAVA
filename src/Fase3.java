import java.util.*;

public class Fase3 {

    static List<Character> characterList;
    static String surname;
    static HashMap<Character,Integer> letters;

    public static void main(String [] args){
        //FASE 3
        System.out.println("---------------------------FASE3-------------------------------");
        characterList = Arrays.asList('I','T','U','R','R','I','A','G','A','Z','A','B','A','L','A','G','A');
        letters=addOccurrences(characterList);
        printHashMap(letters);
    }


    private static HashMap<Character,Integer > addOccurrences(List<Character> list) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character currentChar : list){
            if(hashMap.containsKey(currentChar)){
                hashMap.put(currentChar, hashMap.get(currentChar)+1);
                //Increment current value for this key in hashMap by 1
            }else {
                hashMap.put(currentChar, 1);
            }
        }
        return hashMap;
    }

    private static void printHashMap(HashMap<Character, Integer> charIntHashMap) {
        Iterator it = charIntHashMap.keySet().iterator();
        while (it.hasNext()) {
            char key = (char) it.next();
            System.out.println("KEY: " + key + " VALUE: " + charIntHashMap.get(key));
        }
    }
}


