public class DnkToRnk {
    public static void main(String[] args){
    System.out.println(DnaToRna("GCTTGG"));
    }

    public static String DnaToRna(String dna){
        String rna = "";
        if (dna.length() == 0) {return "";}
        for (int i = 0; i < dna.length(); i++) {
            if (translatorRna(dna.charAt(i)) == 'E') {return null;}
            else {rna = rna + translatorRna(dna.charAt(i));}
        }
        return rna;
    }
    public static char translatorRna(char dnaSymbol){
        switch (dnaSymbol){
            case 'G' : return 'C';
            case 'C' : return 'G';
            case 'T' : return 'A';
            case 'A' : return 'U';
         }
         return 'E';
    }
}
