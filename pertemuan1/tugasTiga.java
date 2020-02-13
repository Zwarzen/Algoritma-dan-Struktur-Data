public class tugasTiga {
    public static void main(String[] args) {
        
        int m = 0; 
        int i = 0; 
        int s = 0; 
        int p = 0;
        
        char arr[] = {'M','I','S','S','I','S','S','I','P','I'};
        
        for(int data = 0; data < arr.length; data++){
            
            if(arr[data] == 'M'){
                m++;
            } 
            
            else if(arr[data] == 'I'){
                i++;
            }
            
            else if(arr[data] == 'S'){
                s++;
            }
            
            else{
                p++;
            
            }
        }
        
        System.out.println("Banyak M : " + m);
        System.out.println("Banyak I : " + i);
        System.out.println("Banyak S : " + s);
        System.out.println("Banyak P : " + p);
    
    }
}