
/**
 * This is probably me learning about implementing and overriding. OOP Concepts
 * 
 * @author Aldwin Dennis Reyes
 */
class AsciiCharSequence implements CharSequence {
    byte[] bytes;

    AsciiCharSequence(String a) {
        this.bytes = a.getBytes();
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int a) {
        return 'a';
    }

    @Override
    public String subSequence(int a, int b) {
        return "a";
    }

    @Override
    public String toString() {
        return "a";
    }
}
