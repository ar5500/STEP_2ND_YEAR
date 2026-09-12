import java.util.*;

public class WordFrequencySimple {

    public static void printFilteredWordFrequency(String feedback) {
        String[] stopWords = {"the","was","and","a","is","of","in"};
        Set<String> stopSet = new HashSet<>(Arrays.asList(stopWords));

        String cleaned = feedback.toLowerCase()
                                 .replace(".", "")
                                 .replace(",", "");

        String[] words = cleaned.split("\\s+");
        Map<String, Integer> freq = new HashMap<>();

        for (String w : words) {
            if (!stopSet.contains(w) && !w.isEmpty()) {
                freq.put(w, freq.getOrDefault(w, 0) + 1);
            }
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((x,y) -> y.getValue() - x.getValue());

        for (Map.Entry<String,Integer> e : list) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public static
