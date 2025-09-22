package day12;

public class VIPCustomer extends Customer {
	private Agent agent;
	
	public VIPCustomer(String customerName, String customerGrade, Agent agent) {
		super(customerName, customerGrade);
		this.agent = agent;
	}
	
	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	@Override
	public void print() {
		super.print();
		System.out.printf("전담 상담사는 %s이고, 번호는 %s입니다.\n", agent.getAgentName(), agent.getAgentNum());
	}
}