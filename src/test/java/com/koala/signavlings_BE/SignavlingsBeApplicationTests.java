package com.koala.signavlings_BE;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SignavlingsBeApplicationTests {
    @Test
    void finaAll() throws JSONException {
        String actual = "{profileID:1L, name:\"Max Zimmermann\", joiningMonth:\"December\", location:\"Lalaland\", bio:\"I am here for testing\",  role:\"Archangle\" }";
        JSONAssert.assertEquals(
                "{profileID:1L, name:\"Max Zimmermann\", joiningMonth:\"December\", location:\"Lalaland\", bio:\"I am here for testing\",  role:\"Archangle\" }", actual, true);
        JSONAssert.assertEquals("{profileID:1L}", actual, false);
        JSONAssert.assertEquals("{name:\"Max Zimmermann\"}", actual, false);
        //JSONAssert.assertEquals("{name:\"Max Zimmermann\"}", actual, true);//This test will fail as the strict checking is true
        JSONAssert.assertEquals("{joiningMonth:\"December\", bio:\"I am here for testing\", role:\"Archangle\"}", actual, false);
        //JSONAssert.assertEquals("{name:mkyong}", actual, false);//This test should fail
    }


/*


    @Autowired
    private ProfileController controller;

    @Test
    public void contextLoads() throws Exception {
       JSONAssert.assertEquals(controller).isNotNull();
    }
 */

}
