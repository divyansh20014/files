import org.apache.camel.Exchange;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class sample_json {
    public String jsonMapping (Exchange exchange) {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new java.util.Date());
		System.out.println("Message received from ATB Acquiring : "+timestamp);
        String textJson = exchange.getIn().getBody(String.class);
		System.out.println("JSON Payload : "+textJson);
		//System.out.println("---------Fetching JSON-----------");
        String source = " ", tran_date = " ", tran_time = " ", tran_date_alt = " ", tran_time_alt = " ", merchant_id = " ", term_pin_entry_cap = " ", card_exp_date = " ", pos_condition_code = " ", card_num = " ", msg_type = " ", terminal_id = " ", issuer_cntry_code = " ", response_code = " ", merchant_mcc = " ", issuer_bin = " ", merchant_city = " ", merchant_cntry_code = " ", merchant_name = " ", service_Code = " ", merchant_address = " ", tbt_ref_num = " ", tran_status = " ", tran_amt = " ", tran_curr_code = " ", mod_amt = " ", settle_curr_code = " ", settle_amount = " ", product_name = " ", auth_id = " ", merchant_bank_name = " ", merchant_acct_num = " ", billing_curr_code = " ", merchant_rm = " ", trans_type = " ", remitt_acct_type = " ", bene_acct_type = " ", pos_entry_mode = " ", eci_ind = " ", ref_num_rrn = " ", client_tran_type = " ", acquirer_reference_number = " ";
		//System.out.println("-------Declaration of Fields------");
        JSONParser parser = new JSONParser();
        try {
            if (textJson != null && !textJson.isEmpty()) {
			//System.out.println("-------getting JSON value------");
                JSONObject jsonObject = (JSONObject) parser.parse(textJson);
				//System.out.println("-------assinging JSONObject value------");

			if((jsonObject.get("source")) != null)
                source = jsonObject.get("source").toString();
			if((jsonObject.get("tran_date")) != null)
				tran_date = jsonObject.get("tran_date").toString();
			if((jsonObject.get("tran_time")) != null)
				tran_time = jsonObject.get("tran_time").toString();
			if((jsonObject.get("tran_date_alt")) != null)
				tran_date_alt = jsonObject.get("tran_date_alt").toString();
			if((jsonObject.get("tran_time_alt")) != null)
				tran_time_alt = jsonObject.get("tran_time_alt").toString();
			if((jsonObject.get("merchant_id")) != null)
				merchant_id = jsonObject.get("merchant_id").toString();
			if((jsonObject.get("term_pin_entry_cap")) != null)
				term_pin_entry_cap = jsonObject.get("term_pin_entry_cap").toString();
			if((jsonObject.get("card_exp_date")) != null)
				card_exp_date = jsonObject.get("card_exp_date").toString();
			if((jsonObject.get("pos_condition_code")) != null)
				pos_condition_code = jsonObject.get("pos_condition_code").toString();
			if((jsonObject.get("card_num")) != null)
				card_num = jsonObject.get("card_num").toString();
			if((jsonObject.get("msg_type")) != null)
				msg_type = jsonObject.get("msg_type").toString();
			if((jsonObject.get("terminal_id")) != null)
				terminal_id = jsonObject.get("terminal_id").toString();
			if((jsonObject.get("issuer_cntry_code")) != null)
				issuer_cntry_code = jsonObject.get("issuer_cntry_code").toString();
			if((jsonObject.get("response_code")) != null)
				response_code = jsonObject.get("response_code").toString();
			if((jsonObject.get("merchant_mcc")) != null)
				merchant_mcc = jsonObject.get("merchant_mcc").toString();
			if((jsonObject.get("issuer_bin")) != null)
				issuer_bin = jsonObject.get("issuer_bin").toString();
			if((jsonObject.get("merchant_city")) != null)
				merchant_city = jsonObject.get("merchant_city").toString();
			if((jsonObject.get("merchant_cntry_code")) != null)
				merchant_cntry_code = jsonObject.get("merchant_cntry_code").toString();
			if((jsonObject.get("merchant_name")) != null)
				merchant_name = jsonObject.get("merchant_name").toString();
			if((jsonObject.get("service_Code")) != null)
				service_Code = jsonObject.get("service_Code").toString();
			if((jsonObject.get("merchant_address")) != null)
				merchant_address = jsonObject.get("merchant_address").toString();
			if((jsonObject.get("tbt_ref_num")) != null)
				tbt_ref_num = jsonObject.get("tbt_ref_num").toString();
			if((jsonObject.get("tran_status")) != null)
				tran_status = jsonObject.get("tran_status").toString();
			if((jsonObject.get("tran_amt")) != null)
				tran_amt = jsonObject.get("tran_amt").toString();
			if((jsonObject.get("tran_curr_code")) != null)
				tran_curr_code = jsonObject.get("tran_curr_code").toString();
			if((jsonObject.get("mod_amt")) != null)
				mod_amt = jsonObject.get("mod_amt").toString();
			if((jsonObject.get("settle_curr_code")) != null)
				settle_curr_code = jsonObject.get("settle_curr_code").toString();
			if((jsonObject.get("settle_amount")) != null)
				settle_amount = jsonObject.get("settle_amount").toString();
			if((jsonObject.get("product_name")) != null)
				product_name = jsonObject.get("product_name").toString();
			if((jsonObject.get("auth_id")) != null)
				auth_id = jsonObject.get("auth_id").toString();
			if((jsonObject.get("merchant_bank_name")) != null)
				merchant_bank_name = jsonObject.get("merchant_bank_name").toString();
			if((jsonObject.get("merchant_acct_num")) != null)
				merchant_acct_num = jsonObject.get("merchant_acct_num").toString();
			if((jsonObject.get("billing_curr_code")) != null)
				billing_curr_code = jsonObject.get("billing_curr_code").toString();
			if((jsonObject.get("merchant_rm")) != null)
				merchant_rm = jsonObject.get("merchant_rm").toString();
			if((jsonObject.get("trans_type")) != null)
				trans_type = jsonObject.get("trans_type").toString();
			if((jsonObject.get("remitt_acct_type")) != null)
				remitt_acct_type = jsonObject.get("remitt_acct_type").toString();
			if((jsonObject.get("bene_acct_type")) != null)
				bene_acct_type = jsonObject.get("bene_acct_type").toString();
			if((jsonObject.get("pos_entry_mode")) != null)
				pos_entry_mode = jsonObject.get("pos_entry_mode").toString();
			if((jsonObject.get("eci_ind")) != null)
				eci_ind = jsonObject.get("eci_ind").toString();
			if((jsonObject.get("ref_num_rrn")) != null)
				ref_num_rrn = jsonObject.get("ref_num_rrn").toString();
			if((jsonObject.get("client_tran_type")) != null)
				client_tran_type = jsonObject.get("client_tran_type").toString();
			if((jsonObject.get("acquirer_reference_number")) != null)
				acquirer_reference_number = jsonObject.get("acquirer_reference_number").toString();
			//System.out.println("-------JSON values have been assigned------");
			//System.out.println("------source------"+source);
			
			String JSONString1="";
				JSONString1 = source +  "," + tran_date + "," + tran_time +  "," + tran_date_alt + "," + tran_time_alt + "," + merchant_id + "," + term_pin_entry_cap + "," + card_exp_date + "," + pos_condition_code + "," + card_num + "," + msg_type + "," + terminal_id + "," + issuer_cntry_code + "," + response_code + "," + merchant_mcc + "," + issuer_bin + "," + merchant_city + "," + merchant_cntry_code + "," + merchant_name + "," + service_Code + "," + merchant_address + "," + tbt_ref_num + "," + tran_status + "," + tran_amt + "," + tran_curr_code + "," + mod_amt + "," + settle_curr_code + "," + settle_amount + "," + product_name + "," + auth_id + "," + merchant_bank_name + "," + merchant_acct_num + "," + billing_curr_code + "," + merchant_rm + "," + trans_type + "," + remitt_acct_type + "," + bene_acct_type + "," + pos_entry_mode + "," + eci_ind + "," + ref_num_rrn + "," + client_tran_type + "," + acquirer_reference_number;
				
				return JSONString1;
				
            } else {
                System.out.println("JSON data is empty or null.--------------------");
				return null;
            }
        } catch (Exception e) {
			logger.error(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}