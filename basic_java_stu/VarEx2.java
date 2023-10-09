package basic_java_stu;

public class VarEx2 {
    
    public static void main(String[] args) {
        /*
         * 기본형
         *  논리형 (boolean), 문자형 (char), 정수형 (byte, short, int, long)
         *  실수형 (float, double)
         */
        System.out.printf("byte size : %d(byte)\n", Byte.BYTES); // 1byte 
        System.out.printf("short size : %d(byte)\n", Short.BYTES); // 2byte
        System.out.printf("integer size : %d(byte)\n", Integer.BYTES); // 4byte
        System.out.printf("long size : %d(byte)\n", Long.BYTES); // 8byte

        System.out.printf("float size : %d(byte)\n", Float.BYTES);
        System.out.printf("double size : %d(byte)\n", Double.BYTES);
    }
}
