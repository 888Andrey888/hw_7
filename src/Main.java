public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Warrior(250, 30, SuperAbilityType.PHYSICAL), new Magic(200, 50, SuperAbilityType.MAGICAL),
                         new Medic(270, 40, SuperAbilityType.HEALING, 10)};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();

            if(heroes[i] instanceof Medic){
                ((Medic)heroes[i]).increaseExperience();
            }
        }
    }
}