package Seminar1;

import Seminar1.Coordinate.Coordinate;
import Seminar1.Enum.Names;
import Seminar1.Hero_Classes.*;
import Seminar1.Interface.Step;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        int countzlo = 0;
        int countdobro = 0;
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество игроков в каждой команде: ");
        int number = scanner.nextInt();
        generateHeroesDobro(number);
        generateHeroesZlo(number);

        while(true){
            AllteamGenerate(dobro, zlo);
            View.view();
            for (Unit zlodey:zlo){
                if (zlodey.getHealth() > 0){
                    countzlo++;
                }

            }
            if (countzlo == 0){
                System.out.println("Добро победило");
                break;
            }

            for (Unit dobryak:dobro){
                if (dobryak.getHealth() > 0){
                    countdobro++;
                }
            }
            if (countdobro == 0){
                System.out.println("Зло победило");
                break;
            }
            input.nextLine();
            for (Unit human:allteam){
                if (dobro.contains(human)) human.Step(zlo);
                else human.Step(dobro);
            }
            countzlo = 0;
            countdobro = 0;



        }














    }

    public static String getNames(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);

    }
    private static void AllteamGenerate(ArrayList<Unit> dobro, ArrayList<Unit> zlo){

        allteam.addAll(dobro);
        allteam.addAll(zlo);
        allteam.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative() );
        /*for (Unit element:allteam){
            if (dobro.contains(element)){
                element.Step((ArrayList<Unit>) zlo);
            }else {
                element.Step((ArrayList<Unit>) dobro);
            }
        }*/

    }

    public static ArrayList<Unit> allteam = new ArrayList<Unit>();
    public static ArrayList<Unit> dobro = new ArrayList<Unit>();
    public static ArrayList<Unit> zlo = new ArrayList<Unit>();




    private static void generateHeroesDobro(int count) {


        for ( int i = 1; i < count+1; i++ ) {
            int x;


            switch( new Random().nextInt( 7 ) ) {
                case 0:
                    dobro.add( new Peasant(getNames(), x = i, 1 ) );

                    break;
                case 1:
                    dobro.add( new Rogue( getNames(), x = i, 1 ) );
                    break;
                case 2:
                    dobro.add( new Sniper( getNames(), i, 1 ) );
                    break;
                case 3:
                    dobro.add( new Magician( getNames(), i, 1 ) );
                    break;
                case 4:
                    dobro.add( new Spearman( getNames(), i, 1 ) );
                    break;
                case 5:
                    dobro.add( new Crossbowman( getNames(), i, 1 ) );
                    break;
                default:
                    dobro.add( new Monk( getNames(), i, 1 ) );
            }


        }

    }
    private static void generateHeroesZlo(int count) {

        for ( int i = 1; i < count+1; i++ ) {

            switch( new Random().nextInt( 7 ) ) {
                case 0:
                    zlo.add( new Peasant(getNames(), i, count ) );
                    break;
                case 1:
                    zlo.add( new Rogue( getNames(), i, count ) );
                    break;
                case 2:
                    zlo.add( new Sniper( getNames(), i, count ) );
                    break;
                case 3:
                    zlo.add( new Magician( getNames(), i, count ) );
                    break;
                case 4:
                    zlo.add( new Spearman( getNames(), i, count ) );
                    break;
                case 5:
                    zlo.add( new Crossbowman( getNames(), i, count ) );
                    break;
                default:
                    zlo.add( new Monk( getNames(), i, count ) );
            }

        }

 }}

