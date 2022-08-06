import java.util.Map;
import java.util.HashMap;

public class KvManager {
    public Map<String, String> kv = new HashMap<String, String>();

    public void add(String key, String value) {
        kv.put(key, value);
    }

    public String get(String key) {
        return kv.get(key);
    }

    public void remove(String key) {
        kv.remove(key);
    }

    public void list() {
        for (String key : kv.keySet()) {
            System.out.println(key + ": " + kv.get(key));
        }
    }
}
