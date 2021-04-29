package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private int hitPoints;
    private int damage;
    private boolean hasArmor;

    public int doDamage(){
        return damage;
    }
    public void sufferDamage(int damage){
        if (hasArmor){
            hitPoints = hitPoints - (damage/2);
        }
       hitPoints = hitPoints - damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isHasArmor() {
        return hasArmor;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHasArmor(boolean hasArmor) {
        this.hasArmor = hasArmor;
    }
}
