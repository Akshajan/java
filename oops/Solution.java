import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> counts = new HashMap<>();
         
        for (int num : arr) {
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
            } else {
                counts.put(num, 1);
            }
        }
        
        int maxFreq = 0;
        for (int freq : counts.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }
        
        int n = arr.size();
        int min_del = n - maxFreq;

        return min_del ;

    
        }

    }

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(br.readLine().trim());

        List<Integer> arr = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    
        int result = Result.equalizeArray(arr);

        bw.write(String.valueOf(result));
        bw.newLine();

        br.close();
        bw.close();
    }
}
