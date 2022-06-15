public class PlayerChar {
//set variables
	private String name;
	private int maxHp;
	private int hp;
	private int str;
	private int con;
	private int dex;
//builder
	public PlayerChar(String name, int maxHp, int hp, int str, int con, int dex) {
		this.name = name;
		this.maxHp = maxHp;
		this.hp = hp;
		this.str = str;
		this.con = con;
		this.dex = dex;
	}
//getters
	public String getName() {
		return this.name;
	}

	public int getMaxHp() {
		return this.maxHp;
	}

	public int getHp() {
		return this.hp;
	}

	public int getStr() {
		return this.str;
	}

	public int getCon() {
		return this.con;
	}

	public int getdex() {
		return this.dex;
	}

//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setMaxHp(int maxHp) {
		this.hp = maxHp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}


}
