package org.example;

public class ExploreMe {
    
    private static void exploreMe(int a, int b, String c) {
        if (a >= 200000 && b - a < 10000 && c.startsWith("@")) {
            String className = c.substring(1);

            try {
                Class.forName(className);
            } catch (ClassNotFoundException ignored) {
            }
        }
    }
}
