package Java.day48_generalRevision;

import java.util.HashMap;
import java.util.Map;

public class C01_NestedMaps {
    public static void main(String[] args) {

       /*
             Request body
    	           {
    	                "firstname" : "Ahmet",
    	                "lastname" : “Bulut",
    	                "totalprice" : 500,
    	                "depositpaid" : false,
    	                "bookingdates" : {
    	                         "checkin" : "2021-06-01",
    	                         "checkout" : "2021-06-10"
    	                                  },
    	                "additionalneeds" : "wi-fi"
    	            }
    	                     */
        // check-in’e ulaşabilmek için önce asıl map’ten booking dates’i almamız gerekir.

        Map<String, Object> bookingdatesMap = new HashMap<>();
        bookingdatesMap.put("checkin", "2021-06-01");
        bookingdatesMap.put("checkout", "2021-06-10");


        Map<String, Object> requestBodyMap = new HashMap<>();
        requestBodyMap.put("firstname", "Ahmet");
        requestBodyMap.put("lastname", "Bulut");
        requestBodyMap.put("totalprice", 500);
        requestBodyMap.put("depositpaid", false);
        requestBodyMap.put("bookingdates", bookingdatesMap);
        requestBodyMap.put("additionalneeds", "wi-fi");


        System.out.println(requestBodyMap.get("bookingdates")); //içerideki map’i getirir


        System.out.println(((Map) (requestBodyMap.get("bookingdates"))).get("checkin"));

    }
}
