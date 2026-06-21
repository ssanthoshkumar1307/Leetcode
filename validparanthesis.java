class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        boolean valid=true;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')stack.push(ch);
            else
            {
                if(stack.isEmpty())
                {
                    valid=false;
                    break;
                }
                char top=stack.peek();
                if(ch==')'&&top=='('||ch=='}'&&top=='{'||ch==']'&&top=='[')
                {
                    stack.pop();
                }
                else
                {
                    valid=false;
                    break;
                }
                
            }
        }
        if(stack.isEmpty()&&valid)return true;
        else return false;
        
    }
}