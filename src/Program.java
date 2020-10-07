import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] arr ={"radar","World","Reverse"};
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(arrSort(str));
        System.out.printf("Самое длинное слово: " + strSort(arr));

    }

    public static String strSort(String[] arr) {
        int maxLengthString = 0;
        String s="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLengthString) {
                maxLengthString = arr[i].length();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == maxLengthString) {
                s = arr[i];
            }
        }
        return s;
    }

    public static String arrSort (String c){
        String b ="";
        for(int i=c.length()-1 ; i>=0 ; i--) {
            StringBuilder sb= new StringBuilder();
            sb.append(c.charAt(i));
            b+=sb;
        }
        if(b.equals(c) ) {
            return "Палиндром";
        }
        return "Не палиндром";
    }
}

