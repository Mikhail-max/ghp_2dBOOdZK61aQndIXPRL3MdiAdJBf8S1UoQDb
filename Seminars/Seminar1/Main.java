package Seminar1;

import Seminar1.Coordinate.Coordinate;
import Seminar1.Enum.Names;
import Seminar1.Hero_Classes.*;
import Seminar1.Interface.Step;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        List<Unit> dobro = generateHeroesDobro(10);
        List<Unit> zlo = generateHeroesZlo(10);
        System.out.println( "\nДобро:" );
        dobro.forEach( u -> System.out.println( u.getInfoCoord() ) );
        Unit sniper = new Sniper(getNames(),0, 0);
        Unit crossbowman = new Crossbowman(getNames(),5,5);
        System.out.println( "\nЗло:" );
        zlo.forEach( u -> System.out.println( u.getInfoCoord() ) );
        System.out.println();
        List<Unit> all = new ArrayList<>();
        all.addAll(dobro);
        all.addAll(zlo);
        all.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return o2.getInitiative() - o1.getInitiative();
            }
        });
        all.forEach(n-> System.out.println(n.toString()));
        Coordinate dist = new Coordinate();
//        int dist = dobro(0)
        Unit hero1 = new Magician(getNames(), 0, 0);
        System.out.println(dobro.get(0).getX());
        dist.distance(dobro.get(0).getX(), dobro.get(0).getY(),
                dobro.get(5).getX(),dobro.get(5).getY());
        System.out.println(dist.distance(dobro.get(0).getX(), dobro.get(0).getY(),
                zlo.get(0).getX(),zlo.get(0).getY()));
        System.out.println("");
        System.out.println("Минимальная дистанция у 0его юнита добра по отношению к злу к");
        System.out.println(dobro.get(0).nearTarget(dobro.get(0), zlo));
        System.out.println(sniper.nearTarget(dobro.get(5), zlo));
        System.out.println(sniper.Step((ArrayList<Unit>) zlo));
        System.out.println(crossbowman.Step((ArrayList<Unit>) zlo));









    }

    public static String getNames(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);

    }
//    public Integer nearTarget(Unit sniper, List<Unit> zlo) {
//        int distmin = 0;
//        int dist = 0;
//        Coordinate distance = new Coordinate();
//        for (int i = 0; i < zlo.size(); i++) {
//            dist = distance.distance(sniper.getX(), sniper.getY(), zlo.get(i).getX(), zlo.get(i).getY());
//            if (distmin <= dist){
//                distmin = dist;
//            }
//
//        }
//        return distmin;
//    }




    public static List<Unit> generateHeroesDobro(int count) {

        List<Unit> list = new ArrayList<>();
        for ( int i = 0; i < count; i++ ) {
            int x;


            switch( new Random().nextInt( 7 ) ) {
                case 0:
                    list.add( new Peasant(getNames(), x = i, 0 ) );
                    System.out.println("Сука х равен " + x);

                    break;
                case 1:
                    list.add( new Rogue( getNames(), x = i, 0 ) );
                    break;
                case 2:
                    list.add( new Sniper( getNames(), i, 0 ) );
                    break;
                case 3:
                    list.add( new Magician( getNames(), i, 0 ) );
                    break;
                case 4:
                    list.add( new Spearman( getNames(), i, 0 ) );
                    break;
                case 5:
                    list.add( new Crossbowman( getNames(), i, 0 ) );
                    break;
                default:
                    list.add( new Monk( getNames(), i, 0 ) );
            }


        }

        return list;
    }
    public static List<Unit> generateHeroesZlo(int count) {
        List<Unit> list = new ArrayList<>();
        for ( int i = 0; i < count; i++ ) {

            switch( new Random().nextInt( 7 ) ) {
                case 0:
                    list.add( new Peasant(getNames(), i, count-1 ) );
                    break;
                case 1:
                    list.add( new Rogue( getNames(), i, count-1 ) );
                    break;
                case 2:
                    list.add( new Sniper( getNames(), i, count-1 ) );
                    break;
                case 3:
                    list.add( new Magician( getNames(), i, count-1 ) );
                    break;
                case 4:
                    list.add( new Spearman( getNames(), i, count-1 ) );
                    break;
                case 5:
                    list.add( new Crossbowman( getNames(), i, count-1 ) );
                    break;
                default:
                    list.add( new Monk( getNames(), i, count-1 ) );
            }

        }

        return list;
 }}

