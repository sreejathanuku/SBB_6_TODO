package dao;

import java.util.List;

import beans.Register;
import beans.Task;

public interface ToDoDAo {
	public int register(Register reg);

	public int login(String email, String pass);

	public boolean addTask(Task task, int regid);

	public List<Task> findAllTasksByRegid(int regId);

	public boolean markTaskCompleted(int taskid, int regid);

	public String getFLNameByRegID(int regId);
}
