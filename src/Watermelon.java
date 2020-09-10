
import java.util.Scanner;



public class Watermelon {

    public static void main(String[] args) {

//
//        char[] chars = s.toCharArray();
//        int index = 0;
//        int counter = 0;
//        char planeNum;
//        boolean isZeroOrOne = true;
//
//        for (int i = 0; i < chars.length && isZeroOrOne; i++) {
//            if (chars[i] != '0' && chars[i] != '1') {
//                isZeroOrOne = false;
//            }
//        }
//
//        if (isZeroOrOne && chars.length <= 100) {
//
//
//            do {
//                for (int i = index; i < chars.length - 1; i++) {
//                    planeNum = chars[i];
//                    int next = chars[i + 1];
//                    index++;
//                    if (planeNum == next) {
//                        counter++;
//                    } else {
//                        counter = 0;
//                        break;
//                    }
//                }
//            } while (index < chars.length - 1 && counter < 11);
//
//
//            if (counter > 11) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//
//
//        } else
//            System.out.println("Incorrect form of data!");
//    }

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if(s.contains("00000000000") || s.contains("11111111111")){
            System.out.println("YES");
        } else
            System.out.println("NO");
}
}
