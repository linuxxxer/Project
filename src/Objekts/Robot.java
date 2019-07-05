package Objekts;

public class Robot extends Objekts {

    private int speed = 1;
    private boolean is_carrying_resource = false;
    private int damage = 100;
    private int fireRate = 2;
    private int default_health = 2000;
    private int health = 2000;
    private int default_shield = 3000;
    private int shield = 3000;

    public Robot(int x, int y) {
        super(x, y);
    }




    private void regenerateShield(){
        if (this.shield < default_shield){
            this.shield += 50;
            if (this.shield > default_shield){
                this.shield = default_shield;
            }
        }
    }


}
