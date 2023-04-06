public class ch4_10 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i < 6 ; i++){
            sum += i;
//            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
            System.out.println("1부터 " + i + "까지의 합: " + sum);
        }
    }
}
