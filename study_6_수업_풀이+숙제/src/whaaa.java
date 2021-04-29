import java.io.UnsupportedEncodingException;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.charset.StandardCharsets;

//(*￣3￣)서연이 문제 풀이(*￣3￣)
public class whaaa {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        char charValue = subject.charAt(3);
        System.out.println(charValue);

        String strVar1 = new String("신민철");
        String strVar2 = "신민철";
        String strVar3 = "신민철";

        try{
            byte[] bytes1 = "문자열".getBytes("EUC-KR");
            byte[] bytes2 = "문자열".getBytes("UTF-8");

        }catch (UnsupportedEncodingException e){

        }
//        String str = new String(byte[] bytes, String charsetName );


    }
}
