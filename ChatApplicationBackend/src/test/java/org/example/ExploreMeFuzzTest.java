package org.example;
import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;

class ExploreMeFuzzTest {

    @FuzzTest
    void exploreMeFuzzTest(FuzzedDataProvider data) {
        int a = data.consumeInt();
        int b = data.consumeInt();
        String c = data.consumeString(100);

        ExploreMe.exploreMe(a, b, c);
    }
}
