/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }
    public void wonTheLottery(){
        face.setImage("astonished");
    }
    public void chocolate(){
        hunger = hunger + 50;

        face.setMessage("I LOVE CHOCOLATE!!!!");
        face.setImage("sick");
        waitABeat(1000);
        face.setMessage("Mr Stark, I don't feel so good...");
        face.setImage("custom_almost_dead");
        }
    public void apple(){
        if (hunger > 5) {
            hunger = hunger - 5;
        } else {
            hunger = 0;
        }
        if (hunger <= 5){
            face.setImage("custom_apple");
            face.setMessage("Yum Yum Yum!!!");
        }
        else {
            face.setImage("happy");
            face.setMessage("Kinda hungry still...");
        }
    }
        public void brocoli(){
        hunger = hunger - 1;
            if (hunger<=3){
                face.setImage("enraged");
                face.setMessage("I'm NOT EATING THAT");
            }else{
                face.setImage("annoyed");
                face.setMessage("BRUH, YOU ARE LUCKY IM EATING THIS...");
        }
    }
        public void hungry(){
            face.setImage("hungry");
            face.setMessage("Clock is ticking and my stomach is getting empty...");
        }
        public void starving(){
            face.setImage("custom_alert");
            face.setMessage("I'M STARVING!!");
        }
        public void medicine(){
            face.setImage("love");
            face.setMessage("You saved me to live for another day!!");
        }
        public void dead(){
            face.setImage("skeleton");
            face.setMessage("nice one...");
        }

 }
    

// end Virtual Pet
