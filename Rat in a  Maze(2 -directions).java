class Main{
    public static int maze(int sr,int sc,int er, int ec){
        if(sr==er && sc==ec){
            return 1;
        }if(sr>er || sc>ec){
            return 0;
        }
        int right =maze(sr,sc+1,er,ec);
        int down = maze(sr+1,sc,er,ec);
        int total_ways=right+down;
        return total_ways;
    }
    
    
    public static void main(String[]args){
        int sr=1,sc=1;
        int er=2, ec=2;
       System.out.println(maze(sr,sc,er,ec));
    }
}
