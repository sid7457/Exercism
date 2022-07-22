class ReverseString {

    String reverse(String inputString) {

        String input="";
        for(int i=inputString.length()-1;i>=0;i--) {
            input = input+inputString.charAt(i) ;
        }
        return input;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
  
}
