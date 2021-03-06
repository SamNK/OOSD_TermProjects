package Iteration_3.MetricsJSONModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListClassLabelsAndPercentage {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("percentage")
    @Expose
    private Double percentage;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = (double) Math.round(percentage * 100);
    }

}
