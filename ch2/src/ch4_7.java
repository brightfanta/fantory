public class ch4_7 {
    public static void main(String[] args) {
        int num = 0;
        int cnt = 0;

        for(int i = 0; i <= 30; i++) {
            num = (int) (Math.random() * 11) - 5;
            System.out.println(num);
//            if(num == 0) {
//                cnt++;
//                System.out.println(num);
//            }
        }
//        System.out.println(cnt);
    }
}
