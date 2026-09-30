import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();
    
    public VPMain(){
        vp.feed();
        vp.exercise();
        this.waitABeat(1000);
        String ans = this.askForInput("Are you ready to eat?");
        if(ans.equals("yes")){
            String choco = this.askForInput("Do you want chocolate?");
            if(choco.equals("yes")){
                vp.chocolate();
                this.waitABeat(1000);
            String med = this.askForInput("Do you want to give me medicine?");
        if(med.equals("yes")){
            this.waitABeat(1000);
            vp.medicine();
        }
        else{
            vp.dead();
        }
            

        }else{
            vp.hunger +=1;
            vp.hungry();
            this.waitABeat(1000);
        String normal = this.askForInput("Are you sure you don't want normal food?");
        if (normal.equals("no")){
            vp.feed();
            this.waitABeat(1000);
            vp.feed();
        } else{
            vp.hunger += 1;
            vp.hungry();
            this.waitABeat(1000);
            
        }
        String apple = this.askForInput("Do you want an apple");
            if(apple.equals("yes")){
                this.waitABeat(100);
                vp.apple();
            }else{
                vp.hungry();
                vp.hunger+=1;
                this.waitABeat(1000);

        
        }
        String brocoli = this.askForInput("Fianlly do you want brocoli?");
            if (brocoli.equals("yes")){
                this.waitABeat(1000);
                vp.brocoli();
            }
        String
        

    }}
    
}

    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public static void main(String[] args) {
        new VPMain();    
    }
}

