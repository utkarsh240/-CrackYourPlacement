import java.util.*;
public class Myhash {

    static class Myhashmap<K,V>{

        public static final int DEFAULT_CAPACITY = 4;
        public static final  float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
            
        }
        private int n;   
        private LinkedList<Node>[] buckets;
        
          private void initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i =0;i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

          }

          private int HashFun(K key){
            int hc = key.hashCode();
          }
        public Myhashmap(){
            initBuckets(DEFAULT_CAPACITY);
        }


        public int size(){

            
        }

        public void put(K key, V value){ // insert 

        }

        public V get(K key){

        }

        public V remove(K key){

        }


    }


    public static void main(String[] args) {
        Myhashmap<String, Integer> mp = new Myhashmap<>();

    }
    
}
