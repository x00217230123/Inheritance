public class ConferenceEvent extends  Event{
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
     private  double lunchCost;
     private boolean dinnerRequired;
     private double dinnerCost;
     private double conferenceEventCost;

     public ConferenceEvent(String eventID,String eventName,String eventLocaton,String eventPointOfContact,double eventCost,int totalParticipants,int totalEventDays,double conferenceEventCost ){
         super(eventID,eventName,eventLocaton,eventPointOfContact,eventCost,totalParticipants,totalEventDays);

     }
     public void setConferenceEventCost(double conferenceEventCost){
         this.conferenceEventCost=conferenceEventCost;
     }
     public double getConferenceEventCost(){
         return conferenceEventCost;
     }
     public void setBreakfastRequired(boolean breakfastRequired){
         this.breakfastRequired=breakfastRequired;

     }
     public boolean getBreakfastRequired(){
         return breakfastRequired;
     }
     public void setBreakfastCost(double breakfastCost){
         this.breakfastCost=breakfastCost;

     }
     public double getBreakfastCost(){
         return breakfastCost;
     }
    public void setLunchRequired(boolean lunchRequired){
        this.lunchRequired=lunchRequired;

    }
    public boolean getLunchRequired(){
        return lunchRequired;
    }
    public void setLunchCost(double lunchCost){
        this.lunchCost=lunchCost;

    }
    public double getLunchCost(){
        return lunchCost;
    }
    public void setDinnerRequired(boolean dinnerRequired){
        this.dinnerRequired=dinnerRequired;

    }
    public boolean getDinnerRequired(){
        return dinnerRequired;
    }
    public void setDinnerCost(double dinnerCost){
        this.dinnerCost=dinnerCost;

    }
    public double getDinnerCost(){
        return dinnerCost;
    }
    public void calculateEventCost(){
         conferenceEventCost=getEventCost()+(getBreakfastCost()+getLunchCost()+getDinnerCost())*getTotalParticipants()*getTotalEventDays();
    }
    public String toString(){
         return "Conference details :"+"\n"+"EventID"+getEventID()+"\n"+"EventName"+getEventName()+"\n"+"Event location"+getEventLocaton()+"\n"+"total participant"+getTotalParticipants()+"\n"+"Total conference cost"+conferenceEventCost;

    }




}