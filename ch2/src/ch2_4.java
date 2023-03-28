public class ch2_4 {
    public static void main(String[] args) {
        char ch = 'A';
        String str = "ABC";
        byte b = 127; // byte type의 경우, -128~127까지 저장 가능
        int oct = 0100; //8진수 맨앞에 0으로 시작
        int hex = 0x100; //16진수 맨 앞에 0x로 시작
        int bin = 0b111; //2진수 맨 앞에 0b로 시작
        // 접두사와 접미사는 대소문자 구별하지 않느다.
        // int max = 2_000_000_000
        //1e3 = 1000.0d
        boolean power = true;
        System.out.println(!power);
        System.out.println(oct);
        System.out.println(hex);
        long l = 10_000_000_000l;
        // 접미사는 출력되지 않는다.
        System.out.println(10f);


    }
}
