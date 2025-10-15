package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        //int 배열 변수 arr1 선언
        int[] arr1 = new int[3];
        //배열 항목 초기값 출력
        for(int i=0; i<3; i++) {
            System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
        }

        System.out.println();
        //배열 항목 값 변경
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        //전체 항목 출력
        for(int i=0; i<3; i++) {
            System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
        }

        System.out.println("\n");

        //double 배열 변수 arr2 선언
        double[] arr2 = new double[3];
        //배열 항목 초기값 출력
        for(int i=0; i<3; i++) {
            System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
        }

        System.out.println();
        //배열 항목 값 변경
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        //전체 항목 출력
        for(int i=0; i<3; i++) {
            System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
        }

        System.out.println("\n");

        //String 배열 변수 arr3 선언
        String[] arr3 = new String[3];
        //배열 항목 초기값 출력
        for(int i=0; i<3; i++) {
            System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
        }

        System.out.println();
        //배열 항목 값 변경
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        //전체 항목 출력
        for(int i=0; i<3; i++) {
            System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
        }
    }
}


