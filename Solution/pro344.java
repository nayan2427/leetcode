public class pro344 {
     public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right){
            char temp  = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String [] args){
        pro344 obj = new pro344();
        char [] s1 = {'h', 'e', 'l', 'l', 'o'};
        char [] s2 = {'n', 'a', 'y', 'a', 'n'};
        obj.reverseString(s1);
        obj.reverseString(s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
