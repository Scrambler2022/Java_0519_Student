import java.util.Scanner;

public class _00_Class_04 {
    public static void main(String[] args) {
        // 번호, 국어, 영어, 수학 점수를 입력받아, calculator() 합계.평균을 구해서 return
        // 번호, 국어, 영어, 수학, 합계, 평균 - int 6개의 인트
        Scanner scan =new Scanner(System.in);
        int[] arr =new int[6];
        String[] title = {"번호","국어","영어","수학","합계","평균"};
        for (int i=0; i<4; i++) {
            System.out.println(title[i]+"를 입력하세요.>>");
            arr[i] = scan.nextInt();
        }
        //calculator()함수 메소드 호출 : 합계,평균을 계산함
        calculator(arr);
        System.out.printf("번호 : %d \n",arr[0]);
        System.out.printf("국어 : %d  , 영어 : %d ,수학 : %d \n,arr[1]arr[2]arr[3]");
        System.out.printf("합계 : %d \n,arr[4]");
        System.out.printf("평균 : %d \n,arr[5]");
    }//main
    static void calculator(int[] arr) {
        //국어 arr[1],영어 arr[2],수학 arr[3]
        arr[4] =arr[1]+arr[2]+arr[3];
        arr[5] = arr[4]/3;

    }

}//class
