package org.akaza.openclinica.web.pform.dto;

import java.util.List;

public class Group {
	private Label label;
	private Repeat repeat;
	private List<Group> group;
	private String appearance;
	private List<UserControl> usercontrol;
	
	
	public Repeat getRepeat() {
		return repeat;
	}
	public void setRepeat(Repeat repeat) {
		this.repeat = repeat;
	}
	public List<Group> getGroup() {
		return group;
	}
	public void setGroup(List<Group> group) {
		this.group = group;
	}
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}	
	public String getAppearance() {
		return appearance;
	}
	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}
	public List<UserControl> getUsercontrol() {
		return usercontrol;
	}
	public void setUsercontrol(List<UserControl> usercontrol) {
		this.usercontrol = usercontrol;
	}
}