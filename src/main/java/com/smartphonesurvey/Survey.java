package com.smartphonesurvey;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Survey 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String brand;
	private String os;
	private String budget;
	private String usageDuration;
	private String features;
	private String screenTime;
	private String buyingFactor;
	private String upgradeFrequency;
	private String rating;
	private String nextBrand;
	private String improvement;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getUsageDuration() {
		return usageDuration;
	}
	public void setUsageDuration(String usageDuration) {
		this.usageDuration = usageDuration;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public String getScreenTime() {
		return screenTime;
	}
	public void setScreenTime(String screenTime) {
		this.screenTime = screenTime;
	}
	public String getBuyingFactor() {
		return buyingFactor;
	}
	public void setBuyingFactor(String buyingFactor) {
		this.buyingFactor = buyingFactor;
	}
	public String getUpgradeFrequency() {
		return upgradeFrequency;
	}
	public void setUpgradeFrequency(String upgradeFrequency) {
		this.upgradeFrequency = upgradeFrequency;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getNextBrand() {
		return nextBrand;
	}
	public void setNextBrand(String nextBrand) {
		this.nextBrand = nextBrand;
	}
	public String getImprovement() {
		return improvement;
	}
	public void setImprovement(String improvement) {
		this.improvement = improvement;
	}
}
