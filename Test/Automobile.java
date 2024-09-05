package Test;

public class Automobile {
    private String make = "Ford";
    private String model = "Escapade";
    private boolean power = false;
    private char gear;
    private int volume;

    public Automobile(char gear, int volume){
        this.gear = gear;
        this.volume = volume;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public boolean getPower(){
        return power;
    }

    public char getGear(){
        return gear;
    }

    public int getVolume(){
        return volume;
    }

    public void setGear(char gear){
        this.gear = gear;
    }

    public void increaseVolume(){
        if (volume <= 30) this.volume +=2;
    }

    public void decreaseVolume(){
        if (volume >= 0) this.volume -=2;
    }

    public void setPower(){
        this.power = !power;
    }
}
