package binus.app.castlevscastle.gameplay;

public class CavalryHero extends Heroes {


    private int CVHattack = 0;

    public CavalryHero(String HeroType, int Attack, int level) {


        this.CVHattack = Attack * 40;
        this.CVHattack = level;


    }

}
