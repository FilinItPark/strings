/**
 * @author 1ommy
 * @version 10.09.2023
 */
public class Main {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Gello");
        // поиск подстроки в строке с помощью суффиксального массива

/*        b.equals(a);
        String longString = "Hello; world; how; are; you; doing; what; is; your; name";
        String[] ar = longString.split("; ");

        String result = "".join(",", ar);


        for (String el : ar) {
            System.out.println(el);
        }
        System.out.println(result);

        for (int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
        }

        System.out.println(b.getBytes(StandardCharsets.UTF_8));

        String[] questions = {"What is your name?", "How old are you?", "Where are you from?"};
        String myQuestino = "what is your name?";

        for (String currentQuestion : questions) {
            if (currentQuestion.equalsIgnoreCase(myQuestino)) {
                System.out.println("Yes");
            }
        }*/

     /*   System.out.println(a.codePointAt(0));

        System.out.println(a.compareTo(b));*/
        /*    a>b -> +number
        a=b -> 0
        a<b -> -number

                { 1, x>0
        sgn(x) ={ 0, x=0
                { -1, x<0
         */
        String a2 = "   ";
/*
        boolean f = a.contains("hell");
        int i = a.indexOf("Hell");
        String a1 = "";


        System.out.println(a1.isEmpty());
        System.out.println(a1.isBlank());

        System.out.println(a2.isEmpty());
        System.out.println(a2.isBlank());
*/

        /*String myQuestion = "     question";
        String trimmed = myQuestion.trim();
        System.out.println(myQuestion.length() > trimmed.length());

//        myQuestion.endsWith("on");
        System.out.println(trimmed);
        System.out.println(trimmed);

        String result = trimmed.substring(0, 1) + trimmed.substring(2, trimmed.length());
        System.out.println(result);
+7 (900) 560-55-55
        */

/*
        String phoneNumberRegex = "\\+7 \\(\\d{3}\\) \\d{3}-\\d{2}-\\d{2}";
        String phoneNumber = "+7 (900) 560-55-55";
        System.out.println(phoneNumber.matches(phoneNumberRegex));*/



        /*
        Input:
        11 50 am
        8 50 pm
         Output:
         1150
         2050

         hours (1 <= h <= 12)
         minutes (1 <= m <= 59)
         period (am / pm)
         */


        int[] ar = {1, 2, 3, 4};
        int[] insert = removeElement(ar, 0);
        System.out.print("[");
        for (int el : insert) {
            System.out.print(el + ", ");
        }
        System.out.print("]");
    }

    /*
    найти место для вставки
    изменить размер массива
    вставить элемент, а все старые элементы сместить на 1 вправо
     */
    static int[] insert(int[] ar, int index, int number) {
        int[] newArray = new int[ar.length + 1];


        if (index == ar.length - 1) {
            for (int i = 0; i < ar.length; i++) {
                newArray[i] = ar[i];
            }

            newArray[ar.length] = number;
        } else {

            for (int i = 0; i < index; i++) {
                newArray[i] = ar[i];
            }

            newArray[index] = number;
            for (int i = index + 1; i < newArray.length; i++) {
                newArray[i] = ar[i - 1];
            }
        }
        return newArray;
    }

    static int[] removeElement(int[] ar, int index) {
        int[] newArray = new int[ar.length - 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = ar[i];
        }
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = ar[i + 1];
        }
        return newArray;
    }
}


