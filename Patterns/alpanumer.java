

class Main {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 1;
        boolean res = true;
        for(int i = 1; i <= 5; i++)
        {
            for(int j=1 ; j<=6 ; j++)
            {
                if(res){
                   System.out.print( n + " ");
                n++ ; 
                res = false;
                }else{
                    
                    System.out.print( ch + " ");
                ch++ ;
                res = true;
                }
                
            }
            System.out.println();
        
        }
    }
}

// this code is for the pattern 1 A 2 B 3 C 4 D 5 E
