//Less efficient solution
class Solution {
    public boolean hasAllCodes(String s, int k) {
        String[] binary = new String[(int)Math.pow(2, k)];
        
        for(int i = 0; i < binary.length; i++){
            binary[i] = Integer.toBinaryString(i);
            if(k - Integer.toBinaryString(i).length() > 0) {
                for(int j = 0; j < k - Integer.toBinaryString(i).length(); j++)
                binary[i] = "0" + binary[i];
            }
        }
        
        
        for(int i = 0; i < binary.length; i++){
            if(!s.contains(binary[i])) return false;
        }
        
        return true;
    }
}

//More efficient solution
class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet();
        for(int i = 0; i <= s.length() - k; i++) set.add(s.substring(i, i + k));
        return set.size() == Math.pow(2, k);
    }
}
