class Solution {

    public void Helper(List<String> ans, int open, int close,int n, String temp){
        if(open == close && temp.length() == n*2){
            ans.add(temp);
        }
        //Add Open Bracket
        if(open<n){
            Helper(ans, open+1, close, n, temp+"(");
        }
        if(open>close){
            Helper(ans, open, close+1, n, temp+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        Helper(ans, 0, 0,n, "");
        return ans;
    }
}