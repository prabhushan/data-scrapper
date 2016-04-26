package com.ozthra.dataimport.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ResponseData {

	private ExtractorData extractorData;

	private class ExtractorData {
		private List<Data> data;

		private class Data {
			private class Group {
				@SerializedName("IMAGE")
				private List<InnerResponse> image;
				@SerializedName("DOCDETAILS CONTENT")
				private List<InnerResponse> docDetails;
				@SerializedName("DOCDETAILS LINKS")
				private List<InnerResponse> practiceLinks;
				@SerializedName("FEESAMOUNT PRICE")
				private List<InnerResponse> fees;
				@SerializedName("GREY LINK")
				private List<InnerResponse> officeLocation;
			}

			@SerializedName("group")
			private List<Group> listGroup;
		}

	}

}
