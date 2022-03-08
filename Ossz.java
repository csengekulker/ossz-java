class Ossz {
    public static void main(String[] args) {
        int[] numbers = new int[8];

        int sum = 0;

        for (int i = 0; i<numbers.length;i++) {
            sum += numbers[i];
        }

        System.out.println("Az összeg: " + sum);
    }
}