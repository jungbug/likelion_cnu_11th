import java.util.*;
public class likelion_202301777_정성윤_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> map = new HashMap();
        while (true) {
            System.out.println();
            System.out.println("멋쟁이사자처럼 로그인 프로그램");
            System.out.println();
            System.out.println("=====================");
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.println("3. 종료");
            System.out.println("=====================");
            System.out.println();
            System.out.print("어떤걸 진행하시겠습니까? : ");
            int selectNum = in.nextInt();
            while (true) {
                if (selectNum > 3 || selectNum < 1) {
                    System.out.println("번호를 다시 확인해주세요");
                    System.out.println();
                    System.out.print("어떤걸 진행하시겠습니까? : ");
                    selectNum = in.nextInt();
                } else {
                    break;
                }
            }

            if ((selectNum == 1 && map.size() == 0) || selectNum == 2) {
                if (selectNum == 1 && map.size() == 0)  {
                    System.out.println("로그인 프로그램 내에 로그인 정보가 없습니다. 회원가입 먼저 진행해주세요.");
                }
                while(true){
                    System.out.print("아이디를 입력하세요 : ");
                    String id = in.next();
                    System.out.print("비밀번호를 입력하세요 : ");
                    String pwd = in.next();
                    if (map.get(id) == null) {
                        map.put(id, pwd);
                        break;
                    } else {
                        System.out.println("이미 있는 아이디 입니다.");
                        System.out.print("다른 아이디로 회원가입을 계속 진행하시겠습니까? (y or n) : ");
                        if (in.next().equals("y")) {
                            continue;
                        } else {
                            break;
                        }
                    }
                }
            } else if (selectNum == 1) {
                System.out.print("아이디를 입력하세요 : ");
                String id = in.next();
                System.out.print("비밀번호를 입력하세요 : ");
                String pwd = in.next();
                if(map.get(id) == null){
                    System.out.println("없는 회원입니다.");
                }else{
                    if(pwd.equals(map.get(id))){
                        System.out.println(id + "회원 성공적으로 로그인하였습니다.");
                        System.out.println("프로그램이 종료됩니다.");
                        System.exit(0);
                    }else{
                        System.out.println("비밀번호가 틀렸습니다");
                    }
                }
            } else if (selectNum == 3) {
                System.out.println("프로그램이 종료됩니다.");
                System.exit(0);
            }
        }
    }
}
