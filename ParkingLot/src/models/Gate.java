package models;

public class Gate extends BaseModel {
	
	private int gateNumber;
	
	private Operator currentOperator;
	
	private GateStatus gateStatus;
	
	private GateType gateType;

	public int getGateNumber() {
		return gateNumber;
	}

	public void setGateNumber(int gateNumber) {
		this.gateNumber = gateNumber;
	}

	public Operator getcurrentOperator() {
		return currentOperator;
	}

	public void setcurrentOperator(Operator operator) {
		this.currentOperator= operator;
	}

	public GateStatus getGateStatus() {
		return gateStatus;
	}

	public void setGateStatus(GateStatus gateStatus) {
		this.gateStatus = gateStatus;
	}

	public GateType getGateType() {
		return gateType;
	}

	public void setGateType(GateType gateType) {
		this.gateType = gateType;
	}

	

}
