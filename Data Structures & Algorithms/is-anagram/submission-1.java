class Solution {
    public boolean isAnagram(String s, String t) {
     
     if (s.length() != t.length())
     return false;

     HashMap<Character, Integer> s1 = new HashMap<>();
     HashMap<Character, Integer> s2 = new HashMap<>();

     for(int i=0; i<s.length(); i++){
        
        s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0) + 1);
     }
        
       for(int j=0; j<t.length(); j++){
        
        s2.put(t.charAt(j),s2.getOrDefault(t.charAt(j),0) + 1);
     } 

     return s1.equals(s2);

     }



    }

