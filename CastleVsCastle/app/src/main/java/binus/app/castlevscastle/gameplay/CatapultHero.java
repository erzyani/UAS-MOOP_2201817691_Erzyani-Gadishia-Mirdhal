package binus.app.castlevscastle.gameplay;

public class CatapultHero extends Heroes{


    private int CTattack = 0;

    public CatapultHero(String HeroType, int Attack, int level) {

        // TODO Auto-generated constructor stub

        this.CTattack = Attack * 40;
        this.CTattack = level;


    }

}
