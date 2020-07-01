package providers;

public class Result {

    private char[] chars;
    private int data;


    public Result(char[] chars, int data) {
        setChars(chars);
        setData(data);
    }

    public Result(){
        setChars(null);
        setData(0);
    }

    public void setChars(char[] chars) {
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            this.chars[i] = chars[i];
        }
    }

    private void setData(int data) {
        this.data = data;
    }

    public char[] getChars() {
        int len = chars.length;
        char[] temp = new char[len];
        for (int i = 0; i < len; i++) {
            temp[i] = chars[i];
        }
        return temp;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("Data: " + data + "%n Chars: ");
        for (int i = 0; i < chars.length; i++) {
            str.append(chars[i]).append(" ");
        }
        return str.toString();
    }
}

