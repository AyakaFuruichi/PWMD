import javax.sound.sampled.SourceDataLine;

public class Exercise4 {
    public static void main(String[] args) {
        char j = 'J';
        char a = 'a';
        char v = 'v';

        System.out.printf("%1$4C  %2$3c %3$3c%3$6c %2$3c\n", j, a, v);
        System.out.printf("%1$4C  %2$2c%2$2c %3$3c%3$4c %2$3c%2$2c\n", j, a, v);
        System.out.printf("%1$-3C%1$C  %2$c%2$c%2$c%2$c%2$c %3$3c%3$2c %2$3c%2$c%2$c%2$c%2$c\n", j, a, v);
        System.out.printf("%1$2C%1$-2C %2$-5c%2$2c %3$3c %2$3c%2$6c\n", j, a, v);
    }
}
