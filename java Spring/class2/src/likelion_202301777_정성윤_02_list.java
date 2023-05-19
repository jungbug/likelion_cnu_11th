import java.util.*;
public class likelion_202301777_정성윤_02_list {
    public static void main(String[] args) {
        ArrayList name = new ArrayList();
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            name.add(in.next());
        }
        for(int i = 0; i<5; i++){
            char a = name.get(i).toString().charAt(0);
            if(Character.compare('이', a) == 0){
                System.out.println(name.get(i));
            }
        }
    }
}
