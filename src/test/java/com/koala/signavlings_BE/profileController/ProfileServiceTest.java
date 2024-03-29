package com.koala.signavlings_BE.profileController;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

class ProfileServiceTest {

    @Test
    void finaAll() throws JSONException {
        String actual = "{id:1L, name:\"Max Zimmermann\", joiningMonth:\"December\", location:\"Lalaland\", bio:\"I am here for testing\",  role:\"Archangle\", photo:\"https://ca.slack-edge.com/T07DBAMS9-U02K8S7V950-5325a191b353-512\"}";
        JSONAssert.assertEquals(
                "{id:1L, name:\"Max Zimmermann\", joiningMonth:\"December\", location:\"Lalaland\", bio:\"I am here for testing\",  role:\"Archangle\", photo:\"https://ca.slack-edge.com/T07DBAMS9-U02K8S7V950-5325a191b353-512\" }", actual, true);
        JSONAssert.assertEquals("{id:1L}", actual, false);
        JSONAssert.assertEquals("{name:\"Max Zimmermann\"}", actual, false);
        JSONAssert.assertEquals("{joiningMonth:\"December\", bio:\"I am here for testing\", role:\"Archangle\"}", actual, false);

        //The following tests should fail
        /*
        JSONAssert.assertEquals("{photo:\"https://ca.slack-edge.com/T07DBAMS9-U02K8S7V950-5325a191b353-512\"}", actual, false);// Test with wrong URL
        JSONAssert.assertEquals("{name:mkyong}", actual, false);//This test should fail as the name is wrong
        JSONAssert.assertEquals("{name:\"Max Zimmermann\"}", actual, true);//This test will fail as the strict checking is true
        */
    }

}