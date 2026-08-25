package GemminiPracticeClassInheritensMars.User;

import java.util.Scanner;

public class ConsolUserInterface implements UserInterface{
        Scanner scanner = new Scanner(System.in);


            @Override
            public String getCommand() {
                return null;
            }

            @Override
            public void end() {

            }

            @Override
            public void invalidCommand() {

            }

            @Override
            public void print() {

            }
}
