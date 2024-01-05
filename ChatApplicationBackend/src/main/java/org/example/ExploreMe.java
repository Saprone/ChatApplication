package org.example;

public class ExploreMe {

    private ExploreMe() {
        throw new IllegalStateException("Utility class");
    }
    
    public static void exploreMe(int a, int b, String c) {
        if (a >= 200000 && b - a < 10000 && c.startsWith("@")) {
            String className = c.substring(1);

            try {
                Class.forName(className);
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException("Incorrect input values.");
            }
        }
    }
}
