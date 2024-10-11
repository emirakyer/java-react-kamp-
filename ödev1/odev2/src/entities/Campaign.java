package entities;

public class Campaign {
    private String campaignName;
    private double discountPercentage;

    public Campaign(String campaignName, double discountPercentage) {
        this.campaignName = campaignName;
        this.discountPercentage = discountPercentage;
    }

    // Getters and Setters
    public String getCampaignName() { return campaignName; }
    public void setCampaignName(String campaignName) { this.campaignName = campaignName; }

    public double getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(double discountPercentage) { this.discountPercentage = discountPercentage; }
}
