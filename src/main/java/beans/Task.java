package beans;

import java.util.Objects;

public class Task {
	private int taskid;
	private String taskNmae;
	private String taskDate;
	private int taskStatus;
	private int taskregid;

	@Override
	public int hashCode() {
		return Objects.hash(taskDate, taskNmae, taskStatus, taskid, taskregid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(taskDate, other.taskDate) && Objects.equals(taskNmae, other.taskNmae)
				&& taskStatus == other.taskStatus && taskid == other.taskid && taskregid == other.taskregid;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public String getTaskNmae() {
		return taskNmae;
	}

	public void setTaskNmae(String taskNmae) {
		this.taskNmae = taskNmae;
	}

	public String getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}

	public int getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}

	public int getTaskregid() {
		return taskregid;
	}

	public void setTaskregid(int taskregid) {
		this.taskregid = taskregid;
	}

	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", taskNmae=" + taskNmae + ", taskDate=" + taskDate + ", taskStatus="
				+ taskStatus + ", taskregid=" + taskregid + "]";
	}

	public Task(int taskid, String taskNmae, String taskDate, int taskStatus, int taskregid) {
		super();
		this.taskid = taskid;
		this.taskNmae = taskNmae;
		this.taskDate = taskDate;
		this.taskStatus = taskStatus;
		this.taskregid = taskregid;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

}
