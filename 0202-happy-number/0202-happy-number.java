class Solution {
    public boolean isHappy(int n) {
        int sum=0;

        while(true){
            sum=0;
            while(n!=0){
                int num=n%10;
                sum=sum+(num*num);
                n=n/10;
            }
            n=sum;
            if(sum==1 || sum==4){
                break;
            }
        }
        if(sum==1){
            return true;
        }
        else{
            return false;
        }
            
         
        
    }
}