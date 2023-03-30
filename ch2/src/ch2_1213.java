public class ch2_1213 {
    public static void main(String[] args) {
        System.out.printf("[%5d]%n", 10);//전체 5자리만들고 거기에 10을 입력한다. 그리고 오른쪽정렬
        System.out.printf("[%-5d]%n", 10);//전체 5자리만들고 거기에 10을 입력한다. 그리고 왼쪽정렬 by "-"
        System.out.printf("[%05d]%n", 10);//전체 5자리만들고 공백은 0으로, 거기에 10을 입력한다. 그리고 오른쪽정렬

        double d = 1.23456789;
        System.out.printf("%f%n", d);//마지막 7은 반올림해서 8로 표기
        System.out.printf("%14.10f%n", d);//14자리, 소수점아래 10자리로 출력 |'  1.2345678900'
        System.out.printf("%14.6f%n", d);//14자리, 소수점아래 6자리로 출력   |'      1.234568'
        System.out.printf("[%s]%n", "www.codechobo.com");
        System.out.printf("[%20s]%n", "www.codechobo.com");//20자리 만들고 오른쪽 정렬!
        System.out.printf("[%-20s]%n", "www.codechobo.com");//20자리 만들고 왼쪽 정렬!

    }
}
