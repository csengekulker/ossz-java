import java.util.Random;
import java.util.ArrayList;

class Ossz {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i<8;i++) {
            int randomNumber = rand.nextInt(25) + 1;

            System.out.println("Szam:" + randomNumber);

            numbers.add(randomNumber);
        }

        int sum = 0;

        for (int i = 0; i<numbers.size();i++) {
            sum += numbers.get(i);
        }

        System.out.println("Az összeg: " + sum);
    }
}