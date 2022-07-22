public class Twofer {
    private String Default_Value = "One for you, one for me.";
    public String twofer(String name) {
        if(name == null)
            return Default_Value;
        else {
            String res="One for "+name+", one for me.";
            return res;
        }
    }
}
