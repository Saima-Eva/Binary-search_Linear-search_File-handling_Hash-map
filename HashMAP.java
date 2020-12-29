
package MAP;

import java.util.HashMap;


public class HashMAP {
    public static void main(String[] args) {
        HashMap<String,Integer> employeeSalary=new HashMap<>();
        employeeSalary.put("Employee-1",1000);
        
        employeeSalary.put("Employee-2",2000);
        employeeSalary.put("Employee-3",3000);
        employeeSalary.put("Employee-4",4000);
        employeeSalary.put("Employee-5",5000);
             System.out.println("Before adding duplicate keys:");
             System.out.println(employeeSalary);
               
             employeeSalary.put("Employee-1",5000);
             employeeSalary.put("Employee-2",6000);
             
          System.out.println("After adding duplicate keys:");
          System.out.println("employeeSalary");
          
             
        
    }
    
}
