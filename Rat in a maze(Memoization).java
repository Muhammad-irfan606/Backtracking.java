class Main{                                                                (TIME COMPLEXITY------------------0(n)
    public static int ways(int sr,int sc,int er,int ec,int [][]dp){
        //base case
        if(sr==er && sc==ec){
            return 1;
        }if(sr>er || sc>ec){
            return 0;
        }
        if(dp[sr][sc] != -1){
            return dp[sr][sc];
        }
        int right = ways(sr,sc+1,er,ec,dp);
        int down = ways(sr+1,sc,er,ec,dp);
        dp[sr][sc]=right+down;
        return dp[sr][sc];
    }
    
    public static void main(String[]args){
        int sr=0,sc=0;
        int er=2,ec=2;
        int [][]dp=new int[er+1][ec+1];
        for(int i=0;i<=er;i++){
            for(int j=0;j<=ec;j++){
                dp[i][j]=-1;
            }
        }
       System.out.println(ways(sr,sc,er,ec,dp));
    }
}


