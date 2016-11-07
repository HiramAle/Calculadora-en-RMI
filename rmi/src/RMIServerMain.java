


public class RMIServerMain {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try 
        {
            RMIService ws = new RMIService();
           
            int suma = ws.getSuma(123, 10);
            int resta = ws.getResta(123, 5);
            int division = ws.getDivi(10, 0);
            
            int multi = ws.getMulti(10, 5);

            System.out.println("suma: " + suma); 
            System.out.println("resta: " + resta); 
            if(division==-1){
                System.out.println("Error: Se dividio entre cero"); 
            }
            System.out.println("division: " + division); 
            System.out.println("multiplicacion: " + multi); 
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("ERROR: " + ex);
        }
    }
}
