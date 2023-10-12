// https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution {
    public List<String> find_permutation(String S) {
     
        ArrayList<String>res= new ArrayList<>();
        HashSet<String>set= new HashSet<>();
        permutationRec("",S,res, set);
        Collections.sort(res);
        return res;
    }
	   
	   public void permutationRec(String ans, String ros, ArrayList<String>res, HashSet<String>set){
	       if(ros.length()==0)
	       {
	           if(!set.contains(ans))
	           {
	               set.add(ans);
	               res.add(ans);
	           }
	       }
	       for(int i=0; i<ros.length(); i++)
	       {
	           char ch= ros.charAt(i);
	           String roStr= ros.substring(0, i)+""+ros.substring(i+1);
	           permutationRec(ans+ch,roStr,res, set);
	       }
	       
	   }
    
}
