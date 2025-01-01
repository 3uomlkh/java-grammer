package week1;

import java.util.Scanner;

public class recipe_memo {
    public static void main(String[] args) {
        // 요리 레시피 메모장
        Scanner sc = new Scanner(System.in);

        // 요리 제목 입력
        String title = sc.nextLine();

        // 요리 별점 입력
        float rate = sc.nextFloat();
        sc.nextLine();

        // 요리 레시피 입력
        String recipe1 = sc.nextLine();
        String recipe2 = sc.nextLine();
        String recipe3 = sc.nextLine();
        String recipe4 = sc.nextLine();
        String recipe5 = sc.nextLine();
        String recipe6 = sc.nextLine();
        String recipe7 = sc.nextLine();
        String recipe8 = sc.nextLine();
        String recipe9 = sc.nextLine();
        String recipe10 = sc.nextLine();

        // 요리 별점을 소수점을 제외한 정수로 형변환
        int intRate = (int) rate;

        // 정수 별점을 5점 만점 퍼센트로 표현했을 때의 퍼센테이지
        double percent = intRate * 100 / 5.0;

        // 출력
        System.out.println("[ " + title + " ]");
        System.out.println("별점: " + intRate + " (" + percent + "%)");
        System.out.println("1. " + recipe1);
        System.out.println("2. " + recipe2);
        System.out.println("3. " + recipe3);
        System.out.println("4. " + recipe4);
        System.out.println("5. " + recipe5);
        System.out.println("6. " + recipe6);
        System.out.println("7. " + recipe7);
        System.out.println("8. " + recipe8);
        System.out.println("9. " + recipe9);
        System.out.println("10. " + recipe10);
    }
}
