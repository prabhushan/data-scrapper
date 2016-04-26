package com.ozthra.dataimport.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ResponseData {

	private ExtractorData extractorData;
	
	private class ExtractorData {
		private String url;
		private List<Data> data;

		private class Data {
			private class Group {
				@SerializedName("IMAGE")
				private List<InnerResponse> image;
				@SerializedName("DOCDETAILS CONTENT")
				private  List<InnerResponse> docDetails;
				@SerializedName("DOCDETAILS LINKS")
				private  List<InnerResponse> practiceLinks;
			}
			@SerializedName("group")
			private List<Group> listGroup;
		}
		
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	

}
