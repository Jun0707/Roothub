package priv.sen.root.dto;

import priv.sen.root.entity.RootUser;
import priv.sen.root.enums.InsertRootUserEnum;
import priv.sen.root.enums.UpdateRootUserEnum;

/**
 * 存储操作用户的结果
 * @author sen
 * 2018年5月6日
 * 下午9:34:13
 * TODO
 */
public class RootUserExecution {

	private String userName;//昵称
	private String password;//密码
	private String email;//邮箱
	private int state;// 结果状态
	private String stateInfo;// 状态标识
	private RootUser user;//成功对象
	
	public RootUserExecution() {
		super();
	}
	
	/**
	 * 注册失败时的构造器
	 * @param userName
	 * @param stateEnum
	 */
	public RootUserExecution(String userName,InsertRootUserEnum stateEnum) {
		this.userName = userName;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	} 
	
	/**
	 * 更新失败时的构造器
	 * @param userName
	 * @param stateEnum
	 */
	public RootUserExecution(String userName,UpdateRootUserEnum stateEnum) {
		this.userName = userName;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	} 
	
	/**
	 * 注册成功时的构造器
	 * @param userName
	 * @param stateEnum
	 * @param user
	 */
	public RootUserExecution(String userName,InsertRootUserEnum stateEnum,RootUser user) {
		this.userName = userName;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.user = user;
	}
	
	/**
	 * 更新成功时的构造器
	 * @param userName
	 * @param stateEnum
	 * @param user
	 */
	public RootUserExecution(String userName,UpdateRootUserEnum stateEnum,RootUser user) {
		this.userName = userName;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.user = user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public RootUser getUser() {
		return user;
	}

	public void setUser(RootUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "RootUserExecution [userName=" + userName + ", password=" + password + ", email=" + email + ", state="
				+ state + ", stateInfo=" + stateInfo + ", user=" + user + "]";
	}
	
}