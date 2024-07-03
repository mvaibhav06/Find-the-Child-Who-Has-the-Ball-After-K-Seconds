class Solution {
    public int numberOfChild(int n, int k) {
        int current = 0;
        int time = 0;

        while(time+n-1 < k){
            time += n-1;
            current = current==0?1:0;
        }
        if(current == 0){
        return k-time;
        }else{
            return n-(k-time)-1;
        }
    }
    
}
