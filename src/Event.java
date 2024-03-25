public class Event {

    private  String eventID;
    private  String eventName;
    private  String eventLocaton;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    public Event(String eventID,String eventName,String eventLocaton,String eventPointOfContact,double eventCost,int totalParticipants,int totalEventDays){
        this.eventID=eventID;
        this.eventLocaton=eventLocaton;
        this.eventCost=eventCost;
        this.eventName=eventName;
        this.eventPointOfContact=eventPointOfContact;
        this.totalParticipants=totalParticipants;
        this.totalEventDays=totalEventDays;



    }
    public void setEventID(String eventID){
        this.eventID=eventID;
    }
    public  String getEventID(){
        return eventID;
    }
    public void setEventName(String eventName){
        this.eventName=eventName;
    }
    public String getEventName(){
        return eventName;
    }
    public void setEventLocaton(String eventLocaton){
        this.eventLocaton=eventLocaton;
    }
    public  String getEventLocaton(){
        return eventLocaton;

    }
    public void setEventCost(double eventCost){
        this.eventCost=eventCost;
    }
    public double getEventCost(){
        return eventCost;
    }
    public void setEventPointOfContact(String eventPointOfContact){
        this.eventPointOfContact=eventPointOfContact;
    }
    public String getEventPointOfContact(){
        return eventPointOfContact;
    }
    public void setTotalParticipants(int totalParticipants){
        this.totalParticipants=totalParticipants;
    }
    public int getTotalParticipants(){
        return totalParticipants;
    }
    public void setTotalEventDays(int totalEventDays){
        this.totalEventDays=totalEventDays;
    }
    public int getTotalEventDays(){
        return totalEventDays;
    }

}