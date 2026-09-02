class Solution {
    public List<List<String>> partition(String s) {
        List<String> subList = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        dfs(0,subList,result,s);
        return result;
    }

    public static boolean isPalindrom(String s){
        int l = 0 ;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static void dfs(int index,List<String> ls,List<List<String>> result, String s){
        
        if(index == s.length()){
            result.add(new ArrayList<>(ls));
            return;
        }
        for(int i = index + 1 ; i <= s.length();i++){
           // System.out.println(s.substring(index,i));
            String sub = s.substring(index,i);
            if(isPalindrom(sub)){
                ls.add(sub);
                dfs(i,ls,result,s);
                ls.remove(ls.size()-1);
            }
        }
        //aab - a ab. aa b.   a a
    }
}
