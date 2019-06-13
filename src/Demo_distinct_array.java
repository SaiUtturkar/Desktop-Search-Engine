
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Demo_distinct_array {
    public static void main(String argv[])
    {
        String id_arr[][]=new String[2][5];
        String final_arr[][]=new String[2][5];
		
	for(int c=0;c<5;c++)
            id_arr[0][c]="sai";
				
	for(int c=0;c<5;c++)
            id_arr[1][c]="abcd";
        
        for(int r=0;r<5;r++)
        {
            for(int c=r+1;c<r;c++)
            {
                if(id_arr[0][r].equals(id_arr[0][c]) && id_arr[1][r].equals(id_arr[1][c]))
                {
                    id_arr[0][c]=null;
                    id_arr[1][c]=null;
                    
                }
            }
        }
        
        for(int i=0;i<5;i++)
        {
            System.out.println(id_arr[0][i]+" "+id_arr[1][i]);
            System.out.println("\n");
        }
          
          //Stream.of(id_arr[1]).distinct().forEach(i -> System.out.print(" " + i));
        
    }
}
