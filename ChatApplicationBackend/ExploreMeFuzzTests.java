package com.bas.chatapplication.fuzztest;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;

class ExploreMeFuzzTests {

    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        int a = data.consumeInt();
        int b = data.consumeInt();
        String c = data.consumeString(100);

        ExploreMe.exploreMe(a, b, c);
    }
}
