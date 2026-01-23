package entities;

public class ImportedProduct extends Products {
	
	private Double customsFree;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void getCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+ " $ "
				+ "(Customs free: $ "
				+ String.format("%.2f", customsFree)
				+ ")";
	}	
	

}
