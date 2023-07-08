package HashTable;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("deth","Study at rupp, work at the bank.");
        hashtable.put("cheak","Study at rupp, work at the bank.");

        System.out.println("All date: "+hashtable);
    }
}
