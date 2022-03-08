import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

class Ossz {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Adja meg a tartomány felső határát: ");
        int range = sc.nextInt();

        sc.close();


        for (int i = 0; i<8;i++) {
            int randomNumber = rand.nextInt(range) + 1;

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