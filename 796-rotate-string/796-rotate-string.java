class Solution {
    public boolean rotateString(String s, String goal) {
        // char[] str1=s.toCharArray();
        // char[] str2=goal.toCharArray();
        // Arrays.sort(str1);
        // Arrays.sort(str2);
        // return Arrays.equals(str1,str2);
        String ans=s+s;
        if(s.length()==goal.length()){
            return ans.contains(goal);
        }
        return false;
    }
}