public class ExploreMe {
    
    public static void exploreMe(int a, int b, String c) {
        if (a >= 20000) {
            if (a >= 200000) {
                if (b - a < 10000) {
                    if (c.startsWith("@")) {
                        String className = c.substring(1);

                        try {
                            Class.forName(className);
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
