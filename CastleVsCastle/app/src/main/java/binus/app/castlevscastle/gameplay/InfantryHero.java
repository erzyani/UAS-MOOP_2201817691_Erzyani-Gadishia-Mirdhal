package binus.app.castlevscastle.gameplay;

public class InfantryHero extends Heroes {

    private int IFattack = 0;
    public InfantryHero(String HeroType, int Attack, int level) {

        this.IFattack = Attack * 40;
        this.IFattack = level;

    }
}
