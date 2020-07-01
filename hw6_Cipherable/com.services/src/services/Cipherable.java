package services;

public interface Cipherable {
    public char[] getSecretChars(int seed);
    //implemented in the inner classes of class Wrapper
}
