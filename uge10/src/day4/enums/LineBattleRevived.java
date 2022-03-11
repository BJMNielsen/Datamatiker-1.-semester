package day4.enums;

import java.util.Random;

public class LineBattleRevived {

    int enemyWeaponChoice() {
        Random random = new Random();
        int choice = random.nextInt(3); //vælger tal ml 0-2
        return choice;
        // 0 = Bomb
        // 1 = Shoot
        // 2 = Trap
    }

    public static void main(String[] args) {
        LineBattleRevived prg = new LineBattleRevived();
        int weaponChoice;
        weaponChoice = prg.enemyWeaponChoice();

        switch (weaponChoice) {
            case 0:
                //enemyPlaceBomb();
                break;
            case 1:
                //enemyShoot();
                break;
            case 2:
                //enemyPlaceTrap();
                break;
        }
    }
}
