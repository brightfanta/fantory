public class ch5_1 {
    public static void main(String[] args) {
        int[] score;        // 참조변수 선언
        score = new int[5];
//        int[] score = new int[5];
        score[3] = 1000;
        System.out.println("score[0] = " + score[0]);
        System.out.println("score[1] = " + score[1]);
        System.out.println("score[2] = " + score[2]);
        System.out.println("score[3] = " + score[3]);
        System.out.println("score[4] = " + score[4]);
    }
}
