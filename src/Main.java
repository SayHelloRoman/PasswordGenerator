import java.util.Random;

class PasswordGenerator {
    private Random random = new Random();
    private String symbols = "qwertyuiopasdfghjklzxcvbnm";

    public PasswordGenerator(String symbols, int seed) {
        this.symbols = symbols;
        this.random = new Random(seed);
    }
    public PasswordGenerator(String symbols) {
        this.symbols = symbols;
    }
    public PasswordGenerator(int seed) {
        this.random = new Random(seed);
    }
    public PasswordGenerator() {}
    public String generate(int length){
        StringBuilder randomString = new StringBuilder();
        for(int i = 0; i <= length; i++){
            randomString.append(this.symbols.charAt(this.random.nextInt(this.symbols.length() + 1)));
        }
        return randomString.toString();
    }

}

public class Main {
    public static void main(String[] args) {
        PasswordGenerator r = new PasswordGenerator();
        System.out.println(r.generate(10));
    }
}