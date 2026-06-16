public class CalculateRepeatedCharacters {
    public static void main(String[] args) {
        String str = "programming";
        for (int  i=0;i<str.length();i++){
            int count = 1;
            for (int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                    str = str.replace(str.charAt(j), '0');
                }
            }
            if(count >1 && str.charAt(i) != '0'){
                System.out.println(str.charAt(i) + " " + count);
            }
        }
    }
}
