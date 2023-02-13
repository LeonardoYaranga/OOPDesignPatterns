
package ec.edu.espe.Strategy.view;

import ec.edu.espe.Strategy.model.SortingContext;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class SortApp {
    // client application class
    public static void main(String[] args) {
        
        int data[]={3,6,4,6,7,8,5,6,7,5,3,3};
        SortingContext sc = new SortingContext();
        int sortedList[]=sc.sort(data);
        
    }
    
}
