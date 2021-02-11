//First approach using two pointers
class Solution {
    public void reverseString(char[] s) {
        int pointer2 = s.length-1;
        int pointer1 = 0;
        while(pointer2 >= s.length/2){
            char temp = s[pointer2];
            s[pointer2] = s[pointer1];
            s[pointer1] = temp;
            pointer2--;
            pointer1++;
        }
    }
}

//Second approach using recursion
class Solution {
  public void helper(char[] s, int left, int right) {
    if (left >= right) return;
    char tmp = s[left];
    s[left++] = s[right];
    s[right--] = tmp;
    helper(s, left, right);
  }

  public void reverseString(char[] s) {
    helper(s, 0, s.length - 1);
  }
}
