package test.Utilities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonDataGettersSetters {
	@JsonProperty("TabName") private List<String> tabName;
	@JsonProperty("FileName") private List<String> fileName;
	@JsonProperty("TaskName") private List<String> taskName;
	@JsonProperty("Department") private List<String> department;
	@JsonProperty("SubTaskDescription") private List<String> subtaskDescription;
	@JsonProperty("StartTask") private List<String> startTask;
	@JsonProperty("TaskDuration") private List<String> taskDuration;
	@JsonProperty("SubTaskStatus") private List<String> subtaskStatus;
	@JsonProperty("ClientApproval") private List<String> clientApproval;
	@JsonProperty("OutputRequirements") private List<String> outputRequirements;
	@JsonProperty("TaskDependencies") private List<String> taskDependencies;
	@JsonProperty("TabsSetup") private List<String> tabsSetup;
	
	public List<String> getTabName() {
		return tabName;
	}
	public void setTabName(List<String> tabName) {
		this.tabName = tabName;
	}
	public List<String> getFileName() {
		return fileName;
	}
	public void setFileName(List<String> fileName) {
		this.fileName = fileName;
	}
	
	public List<String> getTaskName() {
		return taskName;
	}
	public void setTaskName(List<String> taskName) {
		this.taskName = taskName;
	}
	public List<String> getDepartment() {
		return department;
	}
	public void setDepartment(List<String> department) {
		this.department = department;
	}
	public List<String> getSubtaskDescription() {
		return subtaskDescription;
	}
	public void setSubtaskDescription(List<String> subtaskDescription) {
		this.subtaskDescription = subtaskDescription;
	}
	public List<String> getStartTask() {
		return startTask;
	}
	public void setStartTask(List<String> startTask) {
		this.startTask = startTask;
	}
	public List<String> getTaskDuration() {
		return taskDuration;
	}
	public void setTaskDuration(List<String> taskDuration) {
		this.taskDuration = taskDuration;
	}
	public List<String> getSubtaskStatus() {
		return subtaskStatus;
	}
	public void setSubtaskStatus(List<String> subtaskStatus) {
		this.subtaskStatus = subtaskStatus;
	}
	public List<String> getClientApproval() {
		return clientApproval;
	}
	public void setClientApproval(List<String> clientApproval) {
		this.clientApproval = clientApproval;
	}
	public List<String> getOutputRequirements() {
		return outputRequirements;
	}
	public void setOutputRequirements(List<String> outputRequirements) {
		this.outputRequirements = outputRequirements;
	}
	public List<String> getTaskDependencies() {
		return taskDependencies;
	}
	public void setTaskDependencies(List<String> taskDependencies) {
		this.taskDependencies = taskDependencies;
	}
	public List<String> getTabsSetup() {
		return tabsSetup;
	}
	public void setTabsSetup(List<String> tabsSetup) {
		this.tabsSetup = tabsSetup;
	}
	
}
