import java.util.Scanner;
public class _00_Class_05 extends _00_Class_04 {
    public static void main(String[] args) {
        String[] title = {"번호", "국어", "영어", "수학", "합계", "평균"};
        //합계 평균을 계산해서 출력하시오
        int[] arr = new int[6];
        input(arr, title);



    }//main
    static void input(int[] arr,String[] title) {
        //입력을 받는 메소드
        Scanner scan = new Scanner(System.in);

        System.out.println("국어점수를 입력하세요");
        for (int i = 0; i < 4; i++) {
            System.out.println(title[i] + "를 입력하세요.>>");
            arr[i] = scan.nextInt();
        }
        arr[4] = arr[1] + arr[2] + arr[3];
        arr[5] = arr[4] / 3;
    }//
}//class
