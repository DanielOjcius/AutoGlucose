/**
 * 
 */
package com.ahaverty.autoglucose.rest;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Alan Haverty
 *
 */
@JsonIgnoreProperties({ "mealImages", "nutritionalConstituents"})
public class MeasurementEntry {
	
	private String id;
	private List<String> tags;	//TODO verify this is right
	private long modifiedAt;
	private long dateOfEntry;
	private long dateOfEntryUtcOffset;
	private long dateOfEntryUtcOffsetSeconds;
	private long dateOfEntryLocal;
	private int points;
	private double bloodGlucoseMeasurement;
	private int penBasalInjectionUnits;
	private int penBolusInjectionUnits;
	private int bolusFoodInsulinUnits;
	private int bolusCorrectionInsulinUnits;
	private int mealCarbohydrates;
	private String mealDescriptionText;
	private String note;
	private double bodyWeight;
	private List<Verifications> verifications;
	private double locationLatitude;
	private double locationLongitude;
	private String locationText;
	private String locationType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public long getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(long modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public long getDateOfEntry() {
		return dateOfEntry;
	}
	public void setDateOfEntry(long dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}
	public long getDateOfEntryUtcOffset() {
		return dateOfEntryUtcOffset;
	}
	public void setDateOfEntryUtcOffset(long dateOfEntryUtcOffset) {
		this.dateOfEntryUtcOffset = dateOfEntryUtcOffset;
	}
	public long getDateOfEntryUtcOffsetSeconds() {
		return dateOfEntryUtcOffsetSeconds;
	}
	public void setDateOfEntryUtcOffsetSeconds(long dateOfEntryUtcOffsetSeconds) {
		this.dateOfEntryUtcOffsetSeconds = dateOfEntryUtcOffsetSeconds;
	}
	public long getDateOfEntryLocal() {
		return dateOfEntryLocal;
	}
	public void setDateOfEntryLocal(long dateOfEntryLocal) {
		this.dateOfEntryLocal = dateOfEntryLocal;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public double getBloodGlucoseMeasurement() {
		return bloodGlucoseMeasurement;
	}
	public void setBloodGlucoseMeasurement(double bloodGlucoseMeasurement) {
		this.bloodGlucoseMeasurement = bloodGlucoseMeasurement;
	}
	public int getPenBasalInjectionUnits() {
		return penBasalInjectionUnits;
	}
	public void setPenBasalInjectionUnits(int penBasalInjectionUnits) {
		this.penBasalInjectionUnits = penBasalInjectionUnits;
	}
	public int getBolusFoodInsulinUnits() {
		return bolusFoodInsulinUnits;
	}
	public void setBolusFoodInsulinUnits(int bolusFoodInsulinUnits) {
		this.bolusFoodInsulinUnits = bolusFoodInsulinUnits;
	}
	public double getLocationLatitude() {
		return locationLatitude;
	}
	public void setLocationLatitude(double locationLatitude) {
		this.locationLatitude = locationLatitude;
	}
	public double getLocationLongitude() {
		return locationLongitude;
	}
	public void setLocationLongitude(double locationLongitude) {
		this.locationLongitude = locationLongitude;
	}
	public String getLocationText() {
		return locationText;
	}
	public void setLocationText(String locationText) {
		this.locationText = locationText;
	}
	public String getLocationType() {
		return locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	public int getBolusCorrectionInsulinUnits() {
		return bolusCorrectionInsulinUnits;
	}
	public void setBolusCorrectionInsulinUnits(int bolusCorrectionInsulinUnits) {
		this.bolusCorrectionInsulinUnits = bolusCorrectionInsulinUnits;
	}
	public int getMealCarbohydrates() {
		return mealCarbohydrates;
	}
	public void setMealCarbohydrates(int mealCarbohydrates) {
		this.mealCarbohydrates = mealCarbohydrates;
	}
	public List<Verifications> getVerifications() {
		return verifications;
	}
	public void setVerifications(List<Verifications> verifications) {
		this.verifications = verifications;
	}
	public double getBodyWeight() {
		return bodyWeight;
	}
	public void setBodyWeight(double bodyWeight) {
		this.bodyWeight = bodyWeight;
	}
	public String getMealDescriptionText() {
		return mealDescriptionText;
	}
	public void setMealDescriptionText(String mealDescriptionText) {
		this.mealDescriptionText = mealDescriptionText;
	}
	public int getPenBolusInjectionUnits() {
		return penBolusInjectionUnits;
	}
	public void setPenBolusInjectionUnits(int penBolusInjectionUnits) {
		this.penBolusInjectionUnits = penBolusInjectionUnits;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
}