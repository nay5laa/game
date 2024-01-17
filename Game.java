package com.mycompany.game;

class Game {
    
    String Name;
    int Speed;
    int HealthPoint;

    public void run() {
        System.out.println(Name + " is running...");
        System.out.println("Speed: " + Speed);
    }

    public boolean isDead() {
        return HealthPoint <= 0;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = "nayi";
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = 96;
    }

    public int getHealthPoint() {
        return HealthPoint;
    }

    public void setHealthPoint(int HealthPoint) {
        this.HealthPoint = 67;
    }
    
    public static void main(String[] args) {

    Game player = new Game();

    player.setName("nayi");
    player.setSpeed(96);
    player.setHealthPoint(67);

    player.run();

    if (player.isDead()) {
        System.out.println("Game Over!");
    }
    
    }
   
}
