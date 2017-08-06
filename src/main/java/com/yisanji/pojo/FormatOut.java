package com.yisanji.pojo;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class FormatOut {
	
	public static String format(String data, String status, String message) {
		Map<String, String> result = new HashMap<String, String>();
		result.put("data", data);
		result.put("status", status);
		result.put("message", message);
		return JSON.toJSONString(result);
	}
	
	public static String handleMessage(String zh, String en) {
		Map<String, String> message = new HashMap<String, String>();
		message.put("zh", zh);
		message.put("en", en);
		return JSON.toJSONString(message);
	}
}
