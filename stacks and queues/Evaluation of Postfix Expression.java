//https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1
class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            
            if(ch == '+'){
                int val2 = st.pop();
                int val1 = st.pop();
                st.push(val1 + val2);
            }
            else if(ch == '-'){
                int val2 = st.pop();
                int val1 = st.pop();
                st.push(val1 - val2);
                
            }
            else if(ch == '*'){
                int val2 = st.pop();
                int val1 = st.pop();
                st.push(val1 * val2);
                
            }
            else if(ch == '/'){
                int val2 = st.pop();
                int val1 = st.pop();
                st.push(val1 / val2);
                
            }
            else{
                st.push(ch - '0');
            }
        }
        return st.pop();
    }
}