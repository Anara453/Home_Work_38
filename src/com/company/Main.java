package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Person> people = new ArrayList<>();
        HashSet<Person> hashSet = new HashSet<>();
        for (int i = 0; i < 100 ; i++) {

            people.add(new Person(12/*rnd.nextInt(100)*/,"A"+ i));
            rnd.nextInt(100);
        }
        Person person1 = new Person(12/*rnd.nextInt(100)*/, "A1");
        int a = 0;
        for(int i =0; i < 100; i++){
            if (people.get(i).getAge() == person1.getAge()) {
                a = 1;
            }
            else {
                a = 0;
            }
        }
        if(a == 0){
            System.out.println("its okay");
            people.add(person1);
            System.out.println("The name of new person that we added: "  + person1.getName());
        }else  {
            System.out.println("ERROR");
            hashSet.add(person1);
        }

        System.out.println("-----------------------------------------");
        for(int i = 0 ; i < hashSet.size(); i++){
            System.out.println(hashSet);
        }
    }
}
