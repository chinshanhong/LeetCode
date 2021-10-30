class Solution {
    public int lengthOfLastWord(String s) {
        String[] res = s.trim().replaceAll("\\s+", " ").split(" ");
        return res[res.length - 1].length();
    }
}
