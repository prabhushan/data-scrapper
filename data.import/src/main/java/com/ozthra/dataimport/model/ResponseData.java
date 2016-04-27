package com.ozthra.dataimport.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ResponseData {

	private ExtractorData extractorData;

	public class ExtractorData {
		private List<Data> data;
		public List<Data> getData() {
			return data;
		}
		public class Data {
			@SerializedName("group")
			private List<Group> listGroup;
			
			public List<Group> getListGroup(){
				return listGroup;
				
			}
			
			public class Group {
				@SerializedName("DOCDETAILS CONTENT")
				private List<InnerResponse> docDetails;
				@SerializedName("DOCDETAILS LINKS")
				private List<InnerResponse> practiceLinks;
				@SerializedName("FEESAMOUNT PRICE")
				private List<InnerResponse> fees;
				@SerializedName("GREY LINK")
				private List<InnerResponse> officeLocation;
				public List<InnerResponse> getDocDetails() {
					return docDetails;
				}
				public void setDocDetails(List<InnerResponse> docDetails) {
					this.docDetails = docDetails;
				}
				public List<InnerResponse> getPracticeLinks() {
					return practiceLinks;
				}
				public void setPracticeLinks(List<InnerResponse> practiceLinks) {
					this.practiceLinks = practiceLinks;
				}
				public List<InnerResponse> getFees() {
					return fees;
				}
				public void setFees(List<InnerResponse> fees) {
					this.fees = fees;
				}
				public List<InnerResponse> getOfficeLocation() {
					return officeLocation;
				}
				public void setOfficeLocation(List<InnerResponse> officeLocation) {
					this.officeLocation = officeLocation;
				}
			}

		
			
		}

		

	}

	public ExtractorData getExtractorData() {
		return extractorData;
	}

	public void setExtractorData(ExtractorData extractorData) {
		this.extractorData = extractorData;
	}

}
