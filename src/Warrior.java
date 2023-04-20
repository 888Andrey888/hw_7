public class Warrior extends Hero{
    public Warrior(int health, int damage, SuperAbilityType superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}
