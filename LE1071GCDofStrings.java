public class LE1071GCDofStrings {
    public static String gcdOfStrings(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int length = a;
        String pattern = str1.substring(0, length);

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) !=pattern.charAt(i % pattern.length())){
                return "";
            }
        }
        for (int j = 0; j < str2.length(); j++) {
            
        
            if(str2.charAt(j) !=pattern.charAt(j % pattern.length())){
                return "";
            }
        }    
        
        return pattern;
       

    }
        

    public static void main(String[] args) {
        String str1 = "AAAAAB";
        String str2 = "AAA";
        System.out.println(gcdOfStrings(str1, str2));
    }

}