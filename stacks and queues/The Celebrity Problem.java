//https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1
class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<n;i++){
            st.push(i);
        }
        
        while(st.size() > 1){
            int val1 = st.pop();
            int val2 = st.pop();
            
            if(M[val1][val2] ==1){
                st.push(val2);
            }
            else{
                st.push(val1);
            }
        }
        
        // check if celebrity exist
        int celeb = st.pop();
        
        for(int i=0;i<n;i++){
            if(i == celeb) continue;
            if(M[i][celeb] == 0 || M[celeb][i] == 1){
                celeb = -1;
                break;
            }
        }
        return celeb;
    }
}