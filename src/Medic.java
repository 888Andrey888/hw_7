public class Medic extends Hero{
    private int healPoints;
    public Medic(int health, int damage, SuperAbilityType superAbilityType, int healPoints) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность MAX HEAL");
    }

    public void increaseExperience(){
        healPoints += healPoints*10/100;
        System.out.println(healPoints);
    }
}
