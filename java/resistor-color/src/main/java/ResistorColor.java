import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ResistorColor {
    private static final Map<String, Integer> list = new HashMap<>();

    public ResistorColor() {
        //list=new HashMap<String, Integer>();
        list.put("black", 0);
        list.put("brown", 1);
        list.put("red", 2);
        list.put("orange", 3);
        list.put("yellow", 4);
        list.put("green", 5);
        list.put("blue", 6);
        list.put("violet", 7);
        list.put("grey", 8);
        list.put("white", 9);

    }

    int colorCode(String color) {
        return list.get(color);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String[] colors() {
        String [] res = new String[10];
        int i=0;
        for (Map.Entry<String,Integer> entry : list.entrySet()) {
            res[i++] = entry.getKey();
        }
            return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
