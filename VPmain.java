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
            this.waitABeat(1000);
            System.exit(1);
        }
            

        }else{
            vp.hunger +=10;
            vp.hungry();
            this.waitABeat(1000);
            if(vp.hunger>=12){
                vp.starving();
                if(vp.hunger>=20){
                    vp.dead();
                    System.exit(1);
                }
            }
        String normal = this.askForInput("Do want normal food?");
        if (normal.equals("yes")){
            vp.feed();
            this.waitABeat(1000);
            vp.feed();
        } else{
            vp.hunger +=10;
            vp.hungry();
            this.waitABeat(1000);
            if(vp.hunger>=12){
                vp.starving();
                if(vp.hunger>=20){
                    vp.dead();
                    System.exit(1);
                }
            }
            
        }
        String apple = this.askForInput("Do you want an apple");
            if(apple.equals("yes")){
                this.waitABeat(1000);
                vp.apple();
            }else{
                vp.hunger +=10;
            vp.hungry();
            this.waitABeat(1000);
            if(vp.hunger>=12){
                vp.starving();
                if(vp.hunger>=20){
                    vp.dead();
                    System.exit(1);
                }
            }

        
        }
        String brocoli = this.askForInput("Finally do you want brocoli?");
            if (brocoli.equals("yes")){
                this.waitABeat(1000);
                vp.brocoli();
            }
        if(ans.equals("yes")){
            String choco1 = this.askForInput("Do you want chocolate?");
            if(choco1.equals("yes")){
                vp.chocolate();
                this.waitABeat(1000);
            String med = this.askForInput("Do you want to give me medicine?");
            if(med.equals("yes")){
            this.waitABeat(1000);
            vp.medicine();
        }
        else{
            String assurance = this.askForInput("SAY YOU SWEAR!! DO YOU WANT MEDICINE???");
            if (assurance.equals("yes")){
                vp.medicine();
        }
            vp.dead();
            this.waitABeat(1000);
            System.exit(1);
        }
        

    }}}} else{
        String ans1 = this.askForInput("LAST CHANCE TO FEED ME, DO YOU WANT TO????");
        if(ans1.equals("yes")){
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
            vp.hunger +=10;
            vp.hungry();
            this.waitABeat(1000);
            if(vp.hunger>=12){
                vp.starving();
                if(vp.hunger>=20){
                    vp.dead();
                    this.waitABeat(1000);
                    System.exit(1);
        }
    }}}}}
    
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

