package medium;

import java.util.TreeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TinyURL {
    String prefix = "https://www.tinyUrl.com/";    
    HashMap<String,String> shortToLong = new HashMap<String,String>();
    HashMap<String,String> longToShort = new HashMap<String,String>();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(longToShort.containsKey(longUrl)) return longToShort.get(longUrl);
        longToShort.put(longUrl, prefix+longUrl.hashCode()+System.nanoTime());
        shortToLong.put(prefix+longUrl.hashCode()+System.nanoTime(), longUrl);
        
        Iterator<Entry<String, String>> it = shortToLong.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> me = (Map.Entry<String,String>)it.next();
            System.out.println(me.getValue());
        }
        
        return longToShort.get(longUrl);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
}
