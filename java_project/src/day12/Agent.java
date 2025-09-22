package day12;

public class Agent {

	// 전담 상담사를 멤버변수에 추가(agentName, agentNum)
	
	private String agentName;
	private String agentNum;
	
	public Agent(String agentName, String agentNum) {
		this.agentName = agentName;
		this.agentNum = agentNum;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentNum() {
		return agentNum;
	}

	public void setAgentNum(String agentNum) {
		this.agentNum = agentNum;
	}
	
	
}