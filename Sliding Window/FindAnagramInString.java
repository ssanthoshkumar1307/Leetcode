class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>list=new ArrayList<>();
        if(s.length()<p.length())return list;
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(char ch : p.toCharArray())map1.put(ch,map1.getOrDefault(ch,0)+1);
        for(int i=0;i<p.length();i++)
        {
            char ch=s.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map1.equals(map2))list.add(0);
        for(int i=p.length();i<s.length();i++)
        {
            char ch=s.charAt(i-p.length());
            if(map2.get(ch)==1)map2.remove(ch);
            else map2.put(ch,map2.get(ch)-1);
            char x=s.charAt(i);
            map2.put(x,map2.getOrDefault(x,0)+1);
            if(map1.equals(map2))list.add(i-p.length()+1);
        }
        return list;
        
    }
}