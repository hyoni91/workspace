package class_basic.stu_manage;


import java.util.Scanner;

//학생생등록, 학생정보변경(연락처), 학생정보출력 / 모든학생정보출력 의 기능   각각의 메서드!
public class StuManage {

    //멤버변수! 초기화는 생성자에서!
    private Scanner sc;  //키보드 입력을 위해 선언
    private StuInfo[] students; //학생 세명을 저장할 배열
    private int idx; //학생 배열의 요소


    public StuManage(){
        sc = new Scanner(System.in);
        students = new StuInfo[3];
        idx = 0;

    }



    //학생등록 메서드
    public void regStu(){

        if (idx >=3){
            System.out.println("등록학생을 초과했습니다.");
        }else {
        //객체를 입력받을 정보
        System.out.println("[학생등록] 학생 정보를 입력하세요.");
        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.print("연락처: ");
        String tel = sc.next();
        System.out.print("학점: ");
        String grade = sc.next();

        //입력받은 정보로 학생 객체를 생성
        StuInfo stuInfo = new StuInfo(name,age,grade,tel);
        //생성한 객체를 배열에 저장
        students[idx] = stuInfo;
        idx++;
        //한번 입력 받으면 idx +1추가 위에서 밑으로 실행!!!!!!!

        }

    }

    //정보변경
    public void changeTell(){
        String name;
        String tel;
        System.out.println("학생의 연락처를 변경합니다.");

        for(int i = 0; i<idx ;i++){
            System.out.println("변경 학생: ");
            name = sc.next();
            if(students[i].getName().equals(name)){
                System.out.println("연락처: ");
                tel = sc.next();
                students[i].setTel(tel);
                System.out.println("변경완료되었습니다");
                break;
            }
            else {
                System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
            }
        }


    }

    //학생정보출력
    public void stuPrint(){

        String name;
        System.out.println("학생정보출력");

        for(int i = 0; i<idx ;i++){
            System.out.println("정보를 열람할 학생: ");
            name = sc.next();

            if(students[i].getName().equals(name)){
                System.out.println("요청하신 학생의 정보입니다.");
                students[i].showInfo();
                break;
            }
            else {
                System.out.println("해당학생은 존재하지 않습니다.");
            }
        }

    }

    //모든학생정보출력
    public void allStuPrint(){
         //배열 길이는 3으로 정해져 있기 때문에, idx로 학생 수를 알 수 있음
        System.out.println("[모든학생정보] 현재 총 학생 수는 "+idx+"명 입니다.");

        //학생 수 만큼 반복함, 그럼 학생 2명의 경우 두번 반복 i= 0 , 1 만큼 변화
        for(int i = 0; i<idx;i++){
            students[i].showInfo();
        }

        }
    }




