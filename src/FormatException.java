public class FormatException extends RuntimeException{
    private char ch;

    public FormatException(char ch) {
        this.ch = ch;
    }

    public char getChar() {
        return ch;
    }
}
