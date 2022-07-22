class RnaTranscription {

    String transcribe(String dnaStrand) {
        String res = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'G')
                res += 'C';
            if (dnaStrand.charAt(i) == 'C')
                res += 'G';
            if (dnaStrand.charAt(i) == 'T')
                res += 'A';
            if (dnaStrand.charAt(i) == 'A')
                res += 'U';
        }
        return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
