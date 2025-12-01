class Main{
    public static void maze(int sr,int sc,int er, int ec,String s){
        if(sr==er && sc==ec){
           System.out.println(s);
        }if(sr>er || sc>ec){
            return ;
        }
        maze(sr,sc+1,er,ec,s+"R");
        maze(sr+1,sc,er,ec,s+"D");
        
    }
    
    
    public static void main(String[]args){
        int sr=1,sc=1;
        int er=3, ec=3;
        String s="";
       maze(sr,sc,er,ec,s);
    }
}
