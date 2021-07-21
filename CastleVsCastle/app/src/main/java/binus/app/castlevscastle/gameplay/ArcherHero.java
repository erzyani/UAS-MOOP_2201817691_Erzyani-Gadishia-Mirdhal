package binus.app.castlevscastle.gameplay;

public class ArcherHero extends Heroes{


    private int ARattack = 0;

    public ArcherHero(String HeroType, int Attack, int level) {

        this.ARattack = Attack * 40;
        this.ARattack = level;


    }

}
