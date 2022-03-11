package day4.enums;

import java.util.Random;

public class LineBattleRevivedEnumVersion {

    WeaponChoice enemyWeaponChoice() {
        Random random = new Random();
        int choice = random.nextInt(3); //vælger tal ml 0-2
        if (choice == 0) {
            return WeaponChoice.BOMB;
        } else if (choice == 1) {
            return WeaponChoice.SHOOT;
        } else if (choice == 2) {
            return WeaponChoice.TRAP;
        } else return null;
    }

    public static void main(String[] args) {
//        LineBattleRevived prg = new LineBattleRevived();
//        WeaponChoice weaponChoice;
////        weaponChoice = prg.enemyWeaponChoice();
////
////        switch (weaponChoice) {
////            case BOMB -> enemyPlaceBomb(); // placeholder metode
////            case SHOOT -> enemyShoot(); // placeholder metode
////            case TRAP -> enemyPlaceTrap(); // placeholder metode
////        }
////    }
////}
    }
}