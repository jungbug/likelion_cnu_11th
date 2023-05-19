import java.util.*;

public class likelion_202301777_정성윤_stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String n = in.next();
        String[] array = n.split("");
        for(int i = 0; i<array.length; i++){
            stack.push(array[i]);
        }
        String result = "";
        for(int i = 0; i<array.length; i++){
            result += stack.pop();
        }
        System.out.println("거꾸로 출력합니다.");
        System.out.print("문자열 출력 : ");
        System.out.println(result);
    }
}
