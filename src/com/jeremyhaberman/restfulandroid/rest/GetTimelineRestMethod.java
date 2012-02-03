package com.jeremyhaberman.restfulandroid.rest;

import java.util.List;
import java.util.Map;

import com.jeremyhaberman.restfulandroid.rest.resource.TwitterTimeline;

public class GetTimelineRestMethod extends AbstractRestMethod<TwitterTimeline>{
	
	private static final String TIMELINE_URI = "api.twitter.com/posts/";
	
	private Map<String, List<String>> headers;
	
	public GetTimelineRestMethod(Map<String, List<String>> headers){
		this.headers = headers;
	}

	@Override
	protected Request buildRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected TwitterTimeline parseResponse(Response response) {
		// extract JSONObject
		// create new Timeline
		return null;
	}

}
