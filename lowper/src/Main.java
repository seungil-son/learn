import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int select = 2;
    public static void main(String[] args) {   // 메인메서드(Main)
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        System.out.printf("Hello and welcome!\n");  //줄바꿈 \n
        System.out.println(); //줄바꿈 '\n' 없이


        for (int i = 1; i <= 5; i++) {
            //TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
            // 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
            System.out.println("i = " + i);
        }
        System.out.println();
        System.out.println("Hello Java!!");
        /*
         * 자바
         * Data Type : 기본타입, 참조타입
         * 종류 : 클래스 변수, 인스턴드 변수, 지역변수
         * --------------------------------------
         * 기본타입(값을 저장) - 8개
         *          문자 : 문자(char), (x)문자열(실질적 객체타입)
         *          숫자 : 정수(byte(1) < short(2) = char(2) < int(4) < long(8)),
         *                 실수( float(사용할때 f를 붙임) < double(기본자료형) )
         *          논리 : boolean(Bool) = 1 or 0
         *
         * 참조타입(주소를 저장) - 배열, 열거형, 클래스, 인터페이스
         *
         *
         */
        char c1 = 'A';
        char c2 = 'A';
        char c3 = '가';

        System.out.println();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.printf("A : %c\n", c1);
        System.out.printf("A : "+ c1);


        float f = 0.12342567890123456789f;
        double d = 0.12324567890123456789;

        System.out.println();
        System.out.println("float f = "+ f);
        System.out.println("double d = " + d); // 표현력이 float보다 높다
        if(select ==1)
        {
            int loper = 10;
            int roper = 0;
            int res = loper/roper;

            System.out.println();
            System.out.println(res);
        }
        else
        {
            int loper= 10;
            double roper = 0.0;
            double res = loper/roper;
            System.out.println();
            System.out.println(res);
        }
        String str = "let's learn Java";
        String str2 = "let's learn Java";

        System.out.println();
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));
        //동일한 값이기 때문에 str과 str2는 동일한 해쉬코드를 가진다.
        System.out.println();

        String str3 = new String("let's learn Java"); //heap 영역에 저장
        String str4 = new String("let's learn Java");
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        int val = Integer.parseInt( "100");   //문자열을 parseInt를 통해 정수로 변환
        double val2 = Double.parseDouble( "3.14");  //문자열을 parseDouble을 통해 실수로 변환

        System.out.println();
        System.out.println(val);
        System.out.println(val2);

        String str1 = String.valueOf(100); //숫자를 valueOf로 문자열로 변환
        String str22 = String.valueOf(3.14);

        System.out.println();
        System.out.println(str1);
        System.out.println(str22);

        test1(); //test1 함수 호출
        test2(); //test2 함수 호출
        test3();

        Scanner sc = new Scanner(System.in); // scanner 객체 생성

        System.out.println();
        System.out.println("input : ");
        System.out.println(sc);

    }
    static void test1(){
        // void = 함수의 출력
        // () = 함수의 입력
        // 입력이 없으니 출력이 없어서 return값이 없다.
        Object obj1 = new Object();
        Object obj2 = obj1;  //객체 복사

        boolean result = obj1.equals(obj2);
        System.out.println(result); //true

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());//동일한 해쉬태그

        boolean result2 = (obj1 == obj2);

        System.out.println(result2); //ture

    }
    static void test2() {
        String str = "홍길동";
        String str2 = "홍길동";

        System.out.println();

        System.out.println(str.equals(str2)); //true

        System.out.println(str == str2); //ture
    }
    static void test3()
    {
        String str = new String("홍길동");
        String str2 = new String("홍길동");

        System.out.println();
        System.out.println(str.equals(str2)); //true equals는 값을 비교한다

        System.out.println(str == str2); //false ==는 주소를 비교한다.

    }
}