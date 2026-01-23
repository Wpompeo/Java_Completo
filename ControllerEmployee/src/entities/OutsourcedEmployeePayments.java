package entities;

public class OutsourcedEmployeePayments extends EmployeePayments {
	
	private Double additionalCharge;
	
	public OutsourcedEmployeePayments() {
		super();
	}

	public OutsourcedEmployeePayments(String name, Integer hours, Double valuePerHour, Double additionalChargeDouble) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalChargeDouble;
	}

	public Double getAdditionalChargeDouble() {
		return additionalCharge;
	}

	public void setAdditionalChargeDouble(Double additionalChargeDouble) {
		this.additionalCharge = additionalChargeDouble;
	}
	
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
	
	
	
	

}
