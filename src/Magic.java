public class Magic extends Hero{
    public Magic(int health, int damage, SuperAbilityType superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность FIREBALL");
    }
}
