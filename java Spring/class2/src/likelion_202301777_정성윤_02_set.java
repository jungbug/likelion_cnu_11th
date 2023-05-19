import java.util.*;
public class likelion_202301777_정성윤_02_set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.print("로또 번호를 몇 개 생성하시겠습니까? : ");
        int num = in.nextInt();
        while(true){
            int random = (int)(Math.random() * 45) + 1;
            set.add(random);
            if(set.size() == num){
                break;
            }
        }
        System.out.println(set);

    }
}
