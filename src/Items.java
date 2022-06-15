public class Items {
	//set variables
	private String itemName;
	private int plusHp;
	private int plusStr;
	private int plusCon;
	private int plusDex;
	//builder
	public Items(String itemName, int plusHp, int plusStr, int plusCon, int plusDex) {
		this.itemName = itemName;
		this.plusHp = plusHp;
		this.plusStr = plusStr;
		this.plusCon = plusCon;
		this.plusDex = plusDex;
	}
	//getters
	public String getItemName() {
		return this.itemName;
	}

	public int getPlusHp() {
		return this.plusHp;
	}

	public int getPlusStr() {
		return this.plusStr;
	}

	public int getPlusCon() {
		return this.plusCon;
	}

	public int getplusDex() {
		return this.plusDex;
	}

	//setters
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setPlusHp(int plusHp) {
		this.plusHp = plusHp;
	}

	public void setPlusStr(int plusStr) {
		this.plusStr = plusStr;
	}

	public void setPlusCon(int plusCon) {
		this.plusCon = plusCon;
	}

	public void setPlusDex(int plusDex) {
		this.plusDex = plusDex;
	}


}
