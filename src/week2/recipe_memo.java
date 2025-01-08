package week2;

import java.util.*;

public class recipe_memo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 자료구조 입력
        String dataStructure = sc.nextLine().trim();

        // 요리 제목 입력
        String recipeTitle = sc.nextLine().trim();

        List<String> list = null;
        Set<String> set = null;
        Map<Integer, String> map = null;

        switch (dataStructure.toLowerCase()) {
            case "list":
                list = new ArrayList<>();
                break;
            case "set":
                set = new LinkedHashSet<>();
                break;
            case "map":
                map = new LinkedHashMap<>();
                break;
            default:
                System.out.println("잘못된 자료구조명을 입력했습니다. 프로그램을 종료합니다.");
                sc.close();
                return;
        }

        // 요리 레시피 입력
        int stepNumber = 1;
        while (true) {
            String step = sc.nextLine().trim();
            if (step.equals("끝")) {
                break;
            }

            if (list != null) {
                list.add(step);
            } else if (set != null) {
                set.add(step);
            } else {
                map.put(stepNumber++, step);
            }
        }

        System.out.println("\n[ " + dataStructure + " 으로 저장된 " + recipeTitle + " ]");

        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        } else if (set != null) {
            int i = 1;
            for (String step : set) {
                System.out.println((i++) + ". " + step);
            }
        } else if (map != null) {
            // keySet()과 values() 사용
            List<Integer> keys = new ArrayList<>(map.keySet());
            List<String> values = new ArrayList<>(map.values());
            for (int i = 0; i < keys.size(); i++) {
                System.out.println(keys.get(i) + ". " + values.get(i));
            }
        }

        sc.close();

    }
}
