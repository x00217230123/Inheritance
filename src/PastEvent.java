import java.util.Scanner;
import java.time.*;
public class PastEvent extends Event{
    Scanner scanner=new Scanner(System.in);
    public static final double pastEventCost=10000;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;

    public PastEvent(String eventID, String eventName, String eventLocaton, String eventPointOfContact, int totalParticipants,int totalEventDays) {
        super(eventID,eventName,eventLocaton,eventPointOfContact,totalParticipants,totalEventDays);}
        public String getPaymentStatus() {
            return paymentStatus;
        }
        public void setPaymentStatus(String status){
            this.paymentStatus=status;

        }
        public boolean getrequiresExtension(){
            return requiresExtension;
        }
        public void setrequiresExtension(boolean requiresExtension){
            this.requiresExtension=requiresExtension;

        }

        public String getPaymentDetails(){
            return paymentDetails;
        }
        public void setPaymentDetails(String paymentDetails){
            this.paymentDetails=paymentDetails;

        }
      
    

    
    
}
