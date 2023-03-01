package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    public String s;

    public ReversedSequence(String s) {
        this.s = s;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int i) {
        return s.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return s.substring(i, i1);
    }

    public static String toString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
// END
