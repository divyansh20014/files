import org.apache.camel.Exchange;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.JSONArray;
import org.apache.log4j.Logger

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class sample_json_response {

	static Logger logger = Logger.getLogger(sample_json_response);
    public String jsonMappingResponse (Exchange exchange) {
	
        String textJson = exchange.getIn().getBody(String.class);
		//System.out.println("-----Sample JSON Response Start-----");
		//System.out.println(textJson);
		JSONParser parser = new JSONParser();
        try {
            if (textJson != null && !textJson.isEmpty()) {
                JSONObject jsonObject = (JSONObject) parser.parse(textJson);
				
				String ref_number = (String) jsonObject.get("rur_30byte_string_004");
				String decision = (String) jsonObject.get("rrr_action_code");
				
				JSONObject resultJson = new JSONObject();
				resultJson.put("transaction_reference_number", ref_number);
				resultJson.put("decision", decision);

				// Convert the result to a string and return it
				String resultString = resultJson.toJSONString();
				// System.out.println(resultString);
				//logger.info(resultString);
				
				String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new java.util.Date());
				System.out.println("Response sent for Ref num(ATB): "+ref_number+" at timestamp:"+timestamp);
				
				return resultString;
			}
            else {
                System.out.println("JSON data is empty or null.--------------------");
				return null;
            }
        } catch (Exception e) {
			logger.error(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}