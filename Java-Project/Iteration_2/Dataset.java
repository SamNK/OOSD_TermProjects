package Iteration_2;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*
This class should parse all the information from the dataset so we can 
process them in our main function
We will get the data from the input json files which we have to parse in this class
*/

public class Dataset {
    @SerializedName("dataset id")
    @Expose
    private Integer datasetId;
    @SerializedName("dataset name")
    @Expose
    private String datasetName;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("assignedUserIds")
    @Expose
    private List<Integer> assignedUserIds;
    @SerializedName("maximum number of labels per instance")
    @Expose
    private Integer maxLabel;
    @SerializedName("class labels")
    @Expose
    private List<Label> labels;
    @SerializedName("instances")
    @Expose
    private List<Instance> instances;
    private ArrayList<User> assignedUsers;
    private DatasetMetric datasetMetric = new DatasetMetric();

    public Dataset() {
    }

    public Dataset(int id, String name, int maxLabel) {
        this.datasetId = id;
        this.datasetName = name;
        this.maxLabel = maxLabel;
    }
    // Getters

    public Integer getDatasetId() {
        return datasetId;
    }

    public String getDatasetName() {
        return datasetName;
    }

    public String getPath() {
        return path;
    }

    public List<Integer> getAssignedUserIds() {
        return this.assignedUserIds;
    }

    public ArrayList<User> getAssignedUsers() {
        return this.assignedUsers;
    }

    public DatasetMetric getDatasetMetric() {
        return datasetMetric;
    }
    // ----------------------Datset Model--------------------------------

    public int getMaxLabel() {
        return maxLabel;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    // Setters

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setAssignedUserIds(List<Integer> assignedUserIds) {
        this.assignedUserIds = assignedUserIds;
    }

    public void setAssignedUsers(ArrayList<User> assignedUsers) {
        this.assignedUsers = assignedUsers;
    }

    public void setMaxLabel(int newMaxLabel) {
        this.maxLabel = newMaxLabel;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    public void setDatasetIdToModel() {
        this.datasetMetric.getDatasetModel().setDatasetId(this.datasetId);
    }

}