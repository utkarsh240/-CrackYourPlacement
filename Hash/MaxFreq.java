import java.util.HashMap;
import java.util.Map;

public class MaxFreq {

    public static void main(String[] args) {
        
        int[] arr ={3,5,3,6,3,6,7,4,1};

        Map<Integer, Integer> freq = new HashMap<>();
        for(int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else{
                freq.put(el,freq.get(el)+1);
            }
        }

        // System.out.println(freq.entrySet());
        
        int maxfreq= 0, anskey =0;
        for(var e : freq.entrySet()){
            if(e.getValue()> maxfreq){
                maxfreq = e.getValue();
                anskey = e.getKey();
            }
            
        }
        System.out.println(anskey);
    }
    
}
