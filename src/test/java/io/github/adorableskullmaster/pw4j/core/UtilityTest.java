package io.github.adorableskullmaster.pw4j.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilityTest {

    @Test
    public void obfuscationTest() {
        assertEquals("abckey=XXXX&adsa",Utility.obfuscateApiKey("abckey=123213ad&adsa"));
        assertEquals("http://politicsandwar.com/api/nation/id=11011/&key=XXXX",
                Utility.obfuscateApiKey("http://politicsandwar.com/api/nation/id=11011/&key=312gv312fs123"));
        assertEquals("http://politicsandwar.com/api/trade-history/key=XXXX&resources=credits&records=2",
                Utility.obfuscateApiKey("http://politicsandwar.com/api/trade-history/key=2134csdsda312&resources=credits&records=2"));
    }

}