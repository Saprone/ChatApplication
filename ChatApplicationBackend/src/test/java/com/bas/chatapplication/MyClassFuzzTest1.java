package com.bas.chatapplication;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;

class MyClassFuzzTest1 {

    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        // Call the functions you want to test with the provided data and optionally
        // assert that the results are as expected.

        // If you want to know more about writing fuzz tests you can check out the
        // example projects at https://github.com/CodeIntelligenceTesting/cifuzz/tree/main/examples
        // or have a look at our docs at https://docs.code-intelligence.com/
    }
}
