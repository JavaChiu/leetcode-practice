package medium;

/*
 * a+bi, where a,b between [-100,100]
 */

public class ComplexNumberMultiply {
    public String complexNumberMultiply(String a, String b) {
        String[] s = a.split("\\+");
        int aStart = Integer.parseInt(s[0]);
        int aEnd = Integer.parseInt(s[1].substring(0,s[1].length()-1));
        
        s = b.split("\\+");
        int bStart = Integer.parseInt(s[0]);
        int bEnd = Integer.parseInt(s[1].substring(0, s[1].length()-1));
        
        int finalStart = aStart*bStart - aEnd*bEnd;
        int finalEnd = aStart*bEnd+aEnd*bStart;
        
        return String.valueOf(finalStart)+"+"+String.valueOf(finalEnd)+"i";
    }

    public static void main(String[] args) {
        ComplexNumberMultiply complexNumberMultiply = new ComplexNumberMultiply();
        String theResult = complexNumberMultiply.complexNumberMultiply("-7+-3i", "-2+1i");
        System.out.println(theResult);
    }
}
